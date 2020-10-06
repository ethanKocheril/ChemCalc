import java.util.ArrayList;
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
  public void getElement(int index){
      System.out.println(this.periodicTable.get(index - 1));
  }
  public void printTable(){
    int index = 1;
    for(Element e: this.periodicTable){
      System.out.println(index + ". " + e);
      index++;
    }
  }
}