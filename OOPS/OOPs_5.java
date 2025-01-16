// // Multiple inheritance 

public class OOPs_5 {
    
    
    public static void main(String... args){
        C obj = new C();
        obj.display();
      }
}
interface A {
  default void display() {
      System.out.println("A display");
  }
}

interface B {
  default void display() {
      System.out.println("B display");
  }
}

class C implements A, B {
   @Override
  public void display() {
      A.super.display();  // Resolving the conflict
  }
}
