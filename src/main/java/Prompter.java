import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prompter {
  
  private static BufferedReader buffReader;
  
  static{
    buffReader = new BufferedReader(new InputStreamReader(System.in));
  }
  
  public static String promptForItemType() throws IOException{
    System.out.printf("What type of item? %n");
    String itemType = buffReader.readLine();
    return itemType; 
  }
  
  public static int promptForMaxNumberOfItems(String itemType) throws IOException{
    System.out.printf("What is the maximum amount of %s? %n", itemType);
    int maxItems = Integer.parseInt(buffReader.readLine());    
    return maxItems;
  }
  
  public static int promptForAGuess(String itemType, int maxItems) throws IOException{
    System.out.printf("How many %s are in the jar? Pick a number between 1 and %d. %n", itemType, maxItems);
    int answer = Integer.parseInt(buffReader.readLine());
    return answer;
  }
  
  public static void printWinningMessage(int tries){
    System.out.printf("You got it in %d attemp(s).%n", tries);
  }
  
  public static void printWarningMessage(int maxItems){
    System.out.printf("Your guess must be less than %d. %n", maxItems);
  }
  
  public static void printTooHightGuessMessage(){
    System.out.printf("Your guess is too high.%n");
  }
  
  public static void printTooLawGuessMessage(){
    System.out.printf("Your guess is too low.%n");
  }
}