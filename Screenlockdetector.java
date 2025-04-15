package one;import java.util.Scanner;

public class Screenlockdetector {
    public static void cheaking(int password, int cheak) {
        if (password == cheak) {
            System.out.println("Welcome your device");
        } else {
            System.out.println("Wrong Password");
            input(password);// function calling
        }
    }
    public  static void input(int password){ // for take input next time if passowrd is wrong
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Password again");
        int cheak = sc.nextInt();
        cheaking(password, cheak);// fuction call for chaking it is right or not
    }
    //using Recursion
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int password = 1234;
        System.out.println("Screen is locked");
        System.out.println("Enter a password");
        int cheak = Sc.nextInt();
        cheaking(password, cheak);
    }
}
