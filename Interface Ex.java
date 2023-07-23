interface AbacusInterface {  
  void add();  
  void sub();  
}  

public class InterfaceExample implements AbacusInterface {  
      
  // Class member variable
  public final static double PI = 3.14159265359; 

  // Class default constructor
  Abacus() { 
    System.out.println("Instantiating class...");
  }

  // add() method implementation
  public void add(int a, int b) { 
    int c = a + b;
    System.out.println("Addition of numbers: " + c);
  }

  // sub() method implementation
  public void sub(int a, int b) { 
    int c = a - b;
    System.out.println("Subtraction of numbers: " + c);
  } 
	
  public static void main(String[] args) {
    System.out.println(Abacus.PI); // 3.14159265359
    Abacus abacus = new Abacus(); // Instantiating class...
    abacus.add(10, 20); // Addition of numbers: 30
    abacus.sub(50, 25); // Subtraction of numbers: 25
  }
}  
