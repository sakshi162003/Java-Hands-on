package one;
class she{
    public void area() {
        System.out.println("displays area");
    }
}
class trIangle extends she {
    public void area (int l,int h) {
        System.out.println(1/2*l*h);
    }
}
class Equilater extends trIangle {
    public void area(int l,int h) {
        System.out.println(1/2*l*h);
    }
}
public class multilevelinhertance {
    public static void main(String[] args) {
        int l=3;
        int h=4;
        she t1 = new she();
        trIangle t2 =new trIangle();
        Equilater t3 = new Equilater();

        t1.area();
        t2.area(l,h);
        t3.area(l,h);
    }
}
