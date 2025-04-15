package one;

import java.util.Scanner;

public class execption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c =a/b;
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("code is executed");
        }
    }
}
