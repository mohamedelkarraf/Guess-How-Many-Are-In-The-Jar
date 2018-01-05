import java.io.IOException;

public class GuessingGame {
    public static void main(String[] args) {
      System.out.printf("Administrator:%n");
      System.out.printf("----------------------%n");
      
      try{
        String itemType = Prompter.promptForItemType();
        int maxItems = Prompter.promptForMaxNumberOfItems(itemType);
        Jar jar = new Jar(itemType, maxItems);
        
        int answer;
        int tries = 0;
        do{
          answer = Prompter.promptForAGuess(itemType, maxItems);
          if(answer > jar.getMaxItems()){
            Prompter.printWarningMessage(jar.getMaxItems());
          }
          else{
            tries++;
            if(answer > jar.getNumberOfItems() && answer - jar.getNumberOfItems() > (jar.getMaxItems()/4)){
              Prompter.printTooHightGuessMessage();
            }
            if(answer < jar.getNumberOfItems() && jar.getNumberOfItems() - answer > (jar.getMaxItems()/4)){
              Prompter.printTooLawGuessMessage();
            }
          }
        }while(answer != jar.getNumberOfItems());
        Prompter.printWinningMessage(tries);
      }catch(IOException ioe){
        ioe.printStackTrace();
      }
    }
}
