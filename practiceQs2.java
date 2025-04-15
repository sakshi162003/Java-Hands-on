package one;

import java.util.Scanner;

//2d array
public class practiceQs2 {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of rows");
        int rows = sc.nextInt();
        System.out.println("Enter size of columans");
        int col = sc.nextInt();
        int [][] number = new int[rows][col];

        //input
        //row
        for(int i =0 ;i<rows;i++){
            //columans
            for(int j =0; j<col;j++) {
                number[i][j]= sc.nextInt();
            }
        }
        //output
        for(int i=0;i<rows;i++) {
            for(int j =0;j<col;j++) {
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }
    }

    }