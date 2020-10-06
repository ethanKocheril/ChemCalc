
public class Element{
  private int atomicNumber;
  private double molarMass;
  private String name;
  
  public Element(int protonCount, double atomicMass, String substance){
    this.atomicNumber = protonCount;
    this.molarMass = atomicMass;    
    this.name = substance;
  }

  public double gramsToMoles(double grams){
    return (grams / this.molarMass);
  }

  public double molesToGrams(double moles){
    return (moles * this.molarMass);
  }

   public String toString(){
     return this.name + " has a molar mass of " + this.molarMass + " g, and an atomic number of " + this.atomicNumber;
   }
}