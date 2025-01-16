// AGGREGATION

public class OOPs_3 {
    
    public static void main(String args[]){
      Address add1 = new Address("Nepal","Gaur","Paroha");
        My bj = new My(20,"Bishal Jaiswal", add1);
        bj.display();
    }
}
class Address{
String country, state, town;
    Address(String c,String s, String t ){
      country = c;
      state = s;
      town = t;
    }
}
class My{
  String name;
  int age;
  Address add;

My (int age, String name, Address add){
      this.age = age;
      this.name = name;
      this. add = add;
}
void display(){
  System.out.println(add.country +" "+ add.state +" "+add.town);
  System.out.println(name+ " "+age);
}
}

