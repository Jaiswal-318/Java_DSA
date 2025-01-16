// Hierarchy of constructor in inheritance

public class OOPs_4 {
    
  public static void main(String[] args){
    Animal d1 = new Dog();     // Notice this line and we can also can Replace Animal by Dog
    System.out.println(d1.s);
   }  
 }
 
 class Animal {        // we can make this class  abstract but out will be same
  String s ="Jacks";
   Animal (){
     System.out.println("Animal is created");
   }
 }
 class Dog extends Animal{
   String s ="Jacks";
   Dog(){
     System.out.print("Dog is created: ");
   }
}
