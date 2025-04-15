package one;

import java.util.Scanner;

public class oprators_binaraynumbersystem {
    public static void main(String[] args) {
        System.out.print("Enter nows year: ");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        System.out.print("Enter birth year: ");
        int b =sc.nextInt();
        int c = a-b;
        System.out.println("your age is: "+c);


    }
}
