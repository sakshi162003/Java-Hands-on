class Student{
    String name;
    int age;
    //polymorphism
    public void printInfo(String name) {
        System.out.println(name);
    }
    public void printInfo(int age) {
        System.out.println(age);
    }
    public void printInfo(String name,int age) {
        System.out.println(name+" "+age);
    }
}
public class oopes2 {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name= "aman";
        s1.age=24;

        s1.printInfo(s1.name,s1.age);
    }
    
}
