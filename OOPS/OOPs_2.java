// Shallow and deep copy

public class OOPs_2 {
    public static void main(String args[]){
     
        Student s1 = new Student(123,"Bishal Jaiswal");
        s1.marks[0] =10;
        s1.marks[2] =100;
         Student s2 = new Student(s1);
         s1.name = "Prince";
         s1.roll = 321;
         s2.marks[0] = 100;
         System.out.println(s2.roll+" "+s2.name+" "+s2.marks[0]);
         System.out.println(s1.roll+" "+ s1.name+" "+s1.marks[0]);
   }
}
class Student{
   int roll;
   String name;
   int marks[] = new int[3];

// creating constructor;
   Student(int i, String s){
      roll = i;
      name = s;}

   Student(Student s1){
      this.marks = s1.marks;
      this. name = s1.name;
      this.roll = s1.roll;
   }
}
