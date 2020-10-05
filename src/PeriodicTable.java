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
  public Element getElement(Element e){
      return e;
  }
  public void printTable(){
    for(Element e: this.periodicTable){
      System.out.println(e);
    }
  }
}
