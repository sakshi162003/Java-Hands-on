package HackerRank;
import  java.util.Scanner;
public class sakshi3{
    public static void main(String[] args) {
        // Sample input array
        int[] arr = {12, 45, 1, 34, 23, 56, 89, 76};

        // Initialize variables for the maximum, second maximum, and third maximum
        int max = 0;
        int secondMax = 0;
        int thirdMax = 0;

        // Traverse through the array to find the maximum, second maximum, and third maximum
        for (int i = 0; i < arr.length; i++) {
            // If current element is greater than max
            if (arr[i] > max) {
                thirdMax = secondMax; // Update third max to the old second max
                secondMax = max; // Update second max to the old max
                max = arr[i]; // Update max to the current element
            }

            // If current element is greater than second max but less than max
            if (arr[i] > secondMax && arr[i] != max) {
                thirdMax = secondMax; // Update third max to the old second max
                secondMax = arr[i]; // Update second max to the current element
            }

            // If current element is greater than third max but less than second max
            if (arr[i] > thirdMax && arr[i] != secondMax && arr[i] != max) {
                thirdMax = arr[i]; // Update third max to the current element
            }
        }

        // Output the result
        System.out.println("Highest: "+max);
        System.out.println("SecondHighest: "+secondMax);
        System.out.println("Thired Max: "+thirdMax);
    }
}
