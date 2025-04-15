package HackerRank;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;
import java.util.Arrays;

public class array {

    public static void main(String[] args) {
        //declartion of array
        // type [] arrayName = new type[sizeOfArray];
        // type arrayName[] = new type[sizeOfArray];
        // type arrayName[sizeOfArray];
        // type arrayName[] = {eliments in array};

        //Question: creating array to store 3 subject marks and print it

        //installizeing array
        int arr[] = new int[3];
        arr[0] = 96;
        arr[1] = 97;
        arr[2] =98;

        for (int i =0;i<arr.length;i++) {
            System.out.println(arr[i]);

        }

        System.out.println();
        System.out.println();
        /*
        Question:  Take an array as input from the user search for a givne number and print the index at which it occures
        //Based on Linear Search Algorithm
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array which you want to give input: ");
        int size = sc.nextInt();
        //declartion of array
        int array[] = new int[size];

        //taking input number of array
        for(int i=0;i<size;i++) {
            array[i] =sc.nextInt();
        }
        //searching number using liner search
        System.out.print("Enter number which you want to search: ");
        int x = sc.nextInt();

        //searching in array
        for (int i=0;i<size;i++) {
            if(array[i] == x) {
                System.out.print("Number foun in index: "+i);
            }

        }

        //Home work of array
        //Question 1 : Take an array of names as input from the user and print them on the screen
        String names[] = new String[size];
        for (int i=0;i<size;i++) {
            names[i] = sc.nextLine();
        }
        for (int i=0;i<size;i++) {
            System.out.println(names[i]);
        }

        // Question 2: Find the maximum & minimum number in an array of integer
        //Integer.MIN_VALUE & Integer.MAX_VALUE

        int numbers[] = new int[size];
        for (int i=0;i<size;i++) {
         numbers[i] = sc.nextInt();
       }
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        for (int i=0;i<numbers.length;i++) {
            if(numbers[i]<min) {
                min = numbers[i];
            }
            if(numbers[i]>max) {
                max =numbers[i];
            }
        }
        System.out.println("Largest number is : "+max);
        System.out.println("Smallest number is: "+min );

int arr1[] = {1, 8 ,5 ,4 ,3 ,7 ,9,12};
int arr2[] = {2 , 55,44,12,20};
        System.out.println();
        System.out.println();
        // using Arrays pakage
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        // array sorting parralle sort from multithrading
        Arrays.parallelSort(arr2);
        System.out.println(Arrays.toString(arr2));


        //compring arry
        if(Arrays.compare(arr1,arr2) ==0) {
            System.out.println("array are equal");
        }
        else {
            System.out.println("Array are not equal");
        }
        //binary search using Array package
        int key = 44;
        int start = 2;
        int end = arr2.length-1;
        int keyy = 12;
        System.out.println(key + "  Fund in the index " + Arrays.binarySearch(arr2,key));

        //copying
        int copy[] = Arrays.copyOf(arr1, arr1.length);
        System.out.println(Arrays.toString(copy));
        for (int i=0;i<copy.length;i++) {
            System.out.print(copy[i]);
        }


        System.out.println("Copied Array: " + Arrays.toString(Arrays.copyOf(arr2, 5)));
        System.out.println("copied arrat: "+ Arrays.toString(Arrays.copyOf(arr1, arr1.length)));

        //copying Range
        System.out.println("Copying in between ranged arra: "+ Arrays.toString(Arrays.copyOfRange(arr1,2,6)));

        //fill in array
        Arrays.fill(arr1,0);
        System.out.println(Arrays.toString(arr1));

        // Hash code
        System.out.println(Arrays.toString(arr2));
        int hashcode = Arrays.hashCode(arr2);
        System.out.println("The Hash code for arr2: "+hashcode);




    }
}
