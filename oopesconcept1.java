package one;
class pen{
    String color;
    String type;//ballpoint;gel

    public static void write() {
        System.out.println("wtiting something");
    }
    public void printColor() {
        System.out.println(this.color);
    }
}
class Student{
    String name;
    String age;
    public void printInfor() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
   // Student() { //normal constructor
   //     System.out.println("constructor called");
   // }
    //Student(String name,String age) {  //parmeterzid constructor
       // this.name =name;
        //this.age = age;
   // }

    //copy constructro
    Student(Student s2) {
        this.name=s2.name;
        this.age =s2.age;
    }
}
public class oopesconcept1 {
    public static void main(String[] args) {
        pen pen1 =new pen();
        pen1.color="blue";
        pen1.type="gel";

        pen pen2= new pen();
        pen2.color = "black";
        pen2.type ="ballpoint";

        pen1.printColor();
        pen2.printColor();

        pen1.write();





    }
}
