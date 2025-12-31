package javaOOP.Polymorphism;

/*
    In a Java class, we can create methods with the same name if they differ in parameters. For example,

    void func() { ... }
    void func(int a) { ... }
    float func(double a) { ... }
    float func(int a, float b) { ... }
    
    This is known as method overloading in Java. 
    Here, the same method will perform different operations based on the parameter.

    Example 3: Polymorphism using method overloading 
*/
class Pattern {

  // method without parameter
  public void display() {
    for (int i = 0; i < 10; i++) {
      System.out.print("*");
    }
  }

  // method with single parameter
  public void display(char symbol) {
    for (int i = 0; i < 10; i++) {
      System.out.print(symbol);
    }
  }
}

class Main {
  public static void main(String[] args) {
    Pattern d1 = new Pattern();

    // call method without any argument
    d1.display();
    System.out.println("\n");

    // call method with a single argument
    d1.display('#');
  }
}
