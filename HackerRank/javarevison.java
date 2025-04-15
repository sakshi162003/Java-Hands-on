package HackerRank;

import java.util.Scanner;

public class javarevison {

    public static void main(String[] args) {
        // Input string
        String input = "abc_123_ghf_456_hji";

        int sum = 0; // To store the total sum
        String number = ""; // To build numbers from digits

        // Loop through each character in the string using traditional for loop
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i); // Get character at the current position

            if (Character.isDigit(ch)) { // Check if the character is a digit
                number += ch;// Append digit to the number string

            } else {
                // If we encounter a non-digit, check if we have a valid three-digit number
                if (number.length() == 3) {
                    sum += Integer.parseInt(number); // Convert to integer and add to sum
                }
                number = ""; // Reset the number string for the next potential number
            }
        }

        // Final check in case the string ends with a three-digit number
        if (number.length() == 3) {
            sum += Integer.parseInt(number);
        }

        // Print the result
        System.out.println("The sum of three-digit numbers is: " + sum);

    }
}
