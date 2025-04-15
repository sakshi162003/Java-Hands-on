package HackerRank;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        /*
        Declartion
        type [][] ArrayName = new type[row][columan];
        int [][] numbers = new int[3][3];
         */
        //taking input in 2d array and show its output

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of row");
        int row= sc.nextInt();
        System.out.println("Enter size of columan");
        int col = sc.nextInt(); //installizing 2d array
        int [][] numbers = new int[row][col];
        //scan value for row
        for (int i =0;i<row;i++){
            //scan value for columa
            for(int j=0;j<col;j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println();//line sapcing
        //printing
        for (int i =0;i<row;i++){

            for(int j=0;j<col;j++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        //Question -  Take matrix as input from user search for  'x' number print index of that number

        int [][] matrix = new int[row][col];

        //taking input matrix
        System.out.println("Enter matrix");
        for (int i=0;i<row;i++) {
            for (int j=0;j<col;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //take input of seraching number
        System.out.print("Enter number which you wnat to serach in matrix: ");
        int x = sc.nextInt();
        //searching number in matrix
        for(int i =0;i<row;i++) {
            for(int j=0;j<col;j++) {
                if(matrix[i][j]== x) {
                    System.out.println("index of the number "+x+" is "+"("+i+","+j+")");
                }
                else {
                    System.out.println("Element not found");
                }
            }
        }

    }
}
