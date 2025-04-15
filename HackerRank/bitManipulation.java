package HackerRank;

public class bitManipulation {
    /*
    bit manpluation use on
    left shift <<
    Right shift >>

    major opration perform
    1) Get opration - know about bit
    2) set bit
    3) clear bit - remove bit
    4) update bit - updation bit

     */

    // Get the 3rd bit  ( possiton =2) of a number n (n=0101) , Bit mask = 1<<postion , opration &
    // a) 1<<2
    //0001<<2
    //0100

    //b) 0100 & 0101 = 0100 (Non zero =1bit, zero = 0bit)

    public static void main(String[] args) {
        int  n=5;
        int pos = 2;
        int bitmask = 1<<2;
        if((bitmask & n)== 0) {
            System.out.println("Bit is zero");
        }
        else {
            System.out.println("Bit is one");
        }

        /*
        set bit

        set 2ne bit (postion = 1) of a number n (n =0101) - 5 in decimal
       1) bit mask = 1<<pos

      1<<1
      0001 << 1
      0010
       2) opration OR

       0010 | 0101 = 0111 = 7 in decimal

         */

        int postion = 1;
        int bitMask = 1<<postion;

        int newNumber = bitMask;
        System.out.println(newNumber);

    }
}
