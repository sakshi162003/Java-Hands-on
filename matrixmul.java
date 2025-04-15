package one;

import java.util.Scanner;

public class matrixmul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first 2x2  matrix");
        int arr1[][]= new int[2][2];
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++){
                arr1[i][j] =sc.nextInt();
            }
        }
        System.out.println("Enter second 2x2  matrix");
        int arr2[][]= new int[2][2];
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++){
                arr2[i][j] =sc.nextInt();
            }
        }
        System.out.println("Matrix 1 is");
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix 2 is");
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Multiplication of matrix 1 and matrix 2 is");
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++){
                System.out.print(arr1[i][j]+arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
