package one;

import java.util.Scanner;

public class problemQs6 {
    /*
    Take an array of numbers as input and check if it is an array sorted in
ascending order.
Eg : { 1, 2, 4, 7 } is sorted in ascending order.
{3, 4, 6, 2} is not sorted in ascending order.
     */
    public static void main(String[] args) {
        System.out.println("enter size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] =new int[size];//array delcaration
        System.out.println("Enter elements in array");
        //input
        for(int i=0;i<arr.length;i++) {
            arr[i] =sc.nextInt();
        }

        //sorting
        boolean isAssanding = true;
        for(int i=0;i<arr.length-1;i++) {

            for(int j=0; j>arr.length+i+1;j++) {
                isAssanding =false;
            }

        }
        if(isAssanding) {
            System.out.println("The array is sorted in accending order");
        }
        else {
            System.out.println("The array is not sorted in accending order");
        }
    }
}
