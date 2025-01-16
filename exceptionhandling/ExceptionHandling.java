public class ExceptionHandling {
    
    // public static void main(String[] args) {  
    //     int arr[] = new int[5];
    //     try  
    //     {
    //       System.out.println("in exception box");
    //       arr[10] = 50;  
    //     int data=50/0; //may throw exception   
    //     System.out.println(data);
    //     }  
    //         // handling the exception by using Exception class      
    //     catch(Exception e)  
    //     {  
    //         System.out.println(e);  
    //         System.out.println("Type of exception stated");
    //     }  
    //     System.out.println("rest of the code");  
    //}  

    public static void main(String args[]){
        int arr[ ] = new int[5];
        try{
         
          arr[10] = 60;
          int data = 50/0;
         
          System.out.println(data);
        }
        catch(ArithmeticException e){
          System.out.println(e);
        }catch(ArrayIndexOutOfBoundsException e){
          System.out.println(e);}
        catch(Exception e){
          System.out.println(e);
        }
        System.out.println("Out of exception block");
      
      }
}
