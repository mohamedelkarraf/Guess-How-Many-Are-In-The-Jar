import java.util.Random;

public class Jar{
  private String itemName;
  private int maxItems;
  private int numberOfitems;
  
  public Jar(String itemName, int maxItems){
    this.itemName = itemName;
    this.maxItems = maxItems;
    fill();
  }
  
  public int getNumberOfItems(){
    return numberOfitems;
  }
  
  private void fill(){
    Random random = new Random();
    numberOfitems = random.nextInt(maxItems-1) + 1;
  }
  
  public String getItemName(){
    return this.itemName;
  }
  
  public void setItemName(String itemName){
    this.itemName = itemName;
  }
  
  public int getMaxItems(){
    return maxItems;
  }
  
  public void setMaxItems(int maxItems){
    this.maxItems = maxItems;
  }
}