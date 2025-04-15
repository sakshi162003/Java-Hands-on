package one;
class Shape {
public void print() {
    System.out.println("printing");
}
}
class Circle extends shape {
    public static void print() {
        System.out.println("kab aage badega india");
    }
}
class Kiran extends circle{
    public static void print() {
        System.out.println("neha lays me");
    }
}
public class oopesconcept2 {
    public static void main(String[] args) {
Shape s1 = new Shape();
s1.print();
    }
}
