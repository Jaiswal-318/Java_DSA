// runtime polymorphism for data member(field)

public class OOPs_6 {
    public static void main(String args[]){
        Bike obj = new Honda();    // if we change reference variable Bike to Honda it prints 40;
        System.out.println(obj.sp);
        obj.acc();
      } 
}

class Bike{
  int sp = 50;
  void acc(){
    System.out.println("change accelerator");
  }
}
class Honda extends Bike {
  int sp = 40;
  void acc(){
    System.out.println("no change");
  }
}

