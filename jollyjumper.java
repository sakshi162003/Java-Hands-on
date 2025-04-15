 import java.util.*;

    public class jollyjumper  {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the sequence of integers separated by spaces:");
            String input = scanner.nextLine();
            String[] numbers = input.split(" ");

            int n = numbers.length;
            boolean[] seen = new boolean[n];

            for (int i = 1; i < n; i++) {
                int diff = Math.abs(Integer.parseInt(numbers[i]) - Integer.parseInt(numbers[i - 1]));
                if (diff < 1 || diff >= n || seen[diff]) {
                    System.out.println("Not jolly");
                    return;
                }
                seen[diff] = true;
            }

            System.out.println("Jolly");
        }
    }


