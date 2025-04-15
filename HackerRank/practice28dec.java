package HackerRank;

import java.util.Scanner;

public class practice28dec {

    /*
    print n natural number
     */
    public static void printNumber(int n, int i) {
        //base case
        if (i ==n) {
            return;
        }
        //work
        System.out.println(i);
        //function calling
        printNumber(n,i+1);
    }

    public static void twoTable(int two) {
        //base case
        if(two ==20) {
            return;
        }
        //working
        System.out.println(two);
        //recall
        twoTable(two+2);
    }


    /*
    recursion good number
     */


    public static void GoodNumber( int number) {
        int ev =0;
        int od =0;
        //base case
        if(number == 0){
            if (ev==od) {
                System.out.println("Good number");
            }
            else {
                System.out.println("Not Good Number");
            }
            return;
        }


        int r = number % 10; // use for find single digit in whole number
        number = number /10; // reduce that digit from number

        if (r % 2 == 0) {
            ev++;
        }
        else {
            od++;
        }
        GoodNumber(number);

    }
    public static void main(String[] args) {
//        int n = 2;
//        int arr[][] = new int[n][n];
        Scanner sc = new Scanner(System.in);
//
//        for (int i=0;i<n;i++) {
//            for (int j=0;j<n;j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        for (int i=0;i<n;i++) {
//            for (int j=0;j<n;j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }

printNumber(5,0);
        System.out.println("Two table");
twoTable(2);

int number = 1234;
GoodNumber(number);

    }
}
