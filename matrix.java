package one;

import java.util.Scanner;

public class matrix {
    //take a matix as input fromt the user search for a given number x and print the indices at which it occurs
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of rows");
        int rows = sc.nextInt();
        System.out.println("Enter size of columans");
        int col = sc.nextInt();
        int[][] number = new int[rows][col];

        //input
        //row
        for (int i = 0; i < rows; i++) {
            //columans
            for (int j = 0; j < col; j++) {
                number[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter number which u want to search");
        int x = sc.nextInt();
//output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (number[i][j] == x) {
                    System.out.println("x found at location (" + i +"," + j + ")");
                }
            }
        }
    }
}