package HackerRank;

public class countNumber {
    public static void main(String[] args) {



                int num = 131;
                int count = 0;

                if (num == 0) {
                    count = 1; // Special case: 0 has 1 digit
                } else {
                    while (num != 0) {
                        num = num / 10; // Remove the last digit
                        count++;        // Increment count
                    }
                }

                System.out.println("Number of digits: " + count);
            }
        }


