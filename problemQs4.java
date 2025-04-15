package one;

import java.util.Scanner;

public class problemQs4 {
    //Take an array of names as input from the user and print them on the screen.
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //for taking names from user how many name they wnat to save
        System.out.println("Enter size of array ");
        int size=sc.nextInt();
        String arr[] =new String[size]; //array declaration
        System.out.println("Enter names line by line");
        //for take names input
        for(int i=0; i<arr.length;i++) {
            arr[i]= sc.nextLine();
        }
        //for display that names we are give in input
        System.out.println("Entered name is");
        for(int i=0; i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
