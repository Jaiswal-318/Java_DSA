public class ExceptionthrowPropa {
     // public static void main(String a[]){
  //   int age = 15;
  //   if(age<18){
  //     throw new ArithmeticException("Not Eligible to watch porn.");
  //   }else{
  //     System.out.println("Eligible to watch porn");
  //   }
  //   System.out.println("Rest of work");
  // }

//  Exception Propagation
  void m(){  
    int data=50/0;  
    System.out.println(data);
  }  
  void n(){  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){System.out.println("exception handled");}  
  }  
  public static void main(String args[]){  
   ExceptionthrowPropa obj=new ExceptionthrowPropa();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}
