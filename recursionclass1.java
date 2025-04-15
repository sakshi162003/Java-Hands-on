package one;
//when we do reccursion then it save in stack format
public class recursionclass1 {

        //print number from 5 to 1
        public static void printNumber(int n) {
            if(n ==0) {//base case
                return;
            }
            System.out.println(n);
            //recursion
            printNumber(n-1);
        }

    public static void main(String[] args) {
            int n=5;
        printNumber(n);
    }
    }

