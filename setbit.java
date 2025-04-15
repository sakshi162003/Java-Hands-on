package one;

public class setbit {
    public static void main(String[] args) {
        //set the 2nd bit(position =1) of a number n .(b =0101)
        //bit mask :1<<i
        //operation :or
        int n =5;
        int pos =1;
        int bitMask =1<<pos;
        int newnumber =bitMask | n; //use of or operation we will setbit in where we have
        System.out.println(newnumber);

    }
}
