package one;

public class clearbit {
    public static void main(String[] args) {
        //clear the 3rd bit (position =1) of a number n.(n=0101)
        //bit mask : 1<<i
        //operation :AND with NOT
        int n =5;
        int pos =2;
        int bitMask =1<<pos;
        int notBitmask =~(bitMask);
        int newnumber = notBitmask & n;
        System.out.println(newnumber);
    }
}
