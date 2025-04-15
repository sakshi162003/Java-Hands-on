package one;
class row{
    public void area() {
        System.out.println("display area");
    }
}
class tra_ngle extends row {
    public void area(int l,int h) {
        System.out.println(1/2*l*h);
    }
}
class circle extends row {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }
}
public class hirachicalinhertance {
    public static void main(String[] args) {
        int l=9;
        int h =6;
        int r=6;
        row t1 = new row();
        tra_ngle t2 = new tra_ngle();
        circle t3 = new circle();
         t1.area();
         t2.area(l,h);
         t3.area(r);
    }
}
