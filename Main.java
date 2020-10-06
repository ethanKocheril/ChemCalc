import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PeriodicTable myPeriodicTable = new PeriodicTable();
    
    System.out.println("Press enter to start");
    while(input.hasNextLine()){
      System.out.println("Hello! Enter an element name, or just type done to exit.");
      String name = input.next();
      if(name.equals("done")) break;
      System.out.println("Enter the element's atomic number");

      int num = input.nextInt();

      System.out.println("Enter the element's molar mass");      
      double mass = input.nextDouble();

      myPeriodicTable.add(new Element(num, mass, name));
    }
    myPeriodicTable.printTable();
    System.out.println("What would you like to do?");
    String action = input.nextLine();
  }    

}
