import java.util.ArrayList;
import java.util.Scanner;
public class PeriodicTable{
  private ArrayList<Element> periodicTable;
  
  public PeriodicTable(){
    this.periodicTable = new ArrayList<>();
  }

  public void add(Element e){
    this.periodicTable.add(e);
  }
  public void remove(Element e){
    this.periodicTable.remove(e);
  }
  public Element getElement(int index){
      return this.periodicTable.get(index - 1);
  }

  public double conversion(String unit1, String unit2){
      double amt1;
      double amt2 = 0;
      Element reference;
      Scanner input = new Scanner(System.in);
      if(unit1.equals("moles") || unit1.equals("grams")){
        System.out.println("Enter the index of the element that you're converting");
        int index = input.nextInt();
        reference = this.periodicTable.get(index-1);

        if(unit1.equals("moles")){
          System.out.println("How many moles do you have?");
          amt1 = input.nextDouble();
          amt2 = reference.molesToGrams(amt1);
        }else{
          System.out.println("How many grams do you have?");
          amt1  = input.nextDouble();
          amt2 = reference.gramsToMoles(amt1);
        }
        return amt2;
      }
      return amt2;
  }

  public void printTable(){
    int index = 1;
    for(Element e: this.periodicTable){
      System.out.println(index + ". " + e);
      index++;
    }
  }
}