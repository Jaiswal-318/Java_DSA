class Parent{    
    void msg()throws Exception {  
      System.out.println("parent method");  
    }    
  }    
      
   class ExceptionInheritance extends Parent{    
    void msg()throws ArithmeticException {  
      System.out.println("child method");  
    }    
      
    public static void main(String args[]) {    
     Parent p = new ExceptionInheritance();    
       
     try {    
     p.msg();    
     }  
     catch (Exception e){}   
    
    }    
  }     