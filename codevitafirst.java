package one;
import java.util.*;

public class codevitafirst {

    public static int minimumLegMovements(int n, String[] instructions) {
        // Tile positions: 0 -> up, 1 -> down, 2 -> left, 3 -> right
        Map<String, Integer> tileMap = new HashMap<>();
        tileMap.put("up", 0);
        tileMap.put("down", 1);
        tileMap.put("left", 2);
        tileMap.put("right", 3);

        // DP table: dp[left][right] - Minimum moves for legs on 'left' and 'right'
        int[][] dp = new int[4][4];
        for (int[] row : dp) Arrays.fill(row, Integer.MAX_VALUE);

        // Initialize DP table: Start with any two tiles
        for (int left = 0; left < 4; left++) {
            for (int right = 0; right < 4; right++) {
                if (left != right) dp[left][right] = 0;
            }
        }

        // Process instructions
        for (String instr : instructions) {
            instr = instr.trim().toLowerCase(); // Normalize input
            if (!tileMap.containsKey(instr)) {
                System.out.println("Invalid instruction: " + instr);
                return -1; // Exit for invalid input
            }

            int target = tileMap.get(instr);
            int[][] nextDp = new int[4][4];
            for (int[] row : nextDp) Arrays.fill(row, Integer.MAX_VALUE);

            for (int left = 0; left < 4; left++) {
                for (int right = 0; right < 4; right++) {
                    if (left == right) continue; // Both feet cannot be on the same tile

                    // Move left foot to the target
                    nextDp[target][right] = Math.min(nextDp[target][right], dp[left][right] + (left == target ? 0 : 1));

                    // Move right foot to the target
                    nextDp[left][target] = Math.min(nextDp[left][target], dp[left][right] + (right == target ? 0 : 1));
                }
            }

            dp = nextDp; // Update DP table
        }

        // Find the minimum moves from the final DP table
        int minMoves = Integer.MAX_VALUE;
        for (int left = 0; left < 4; left++) {
            for (int right = 0; right < 4; right++) {
                if (left != right) {
                    minMoves = Math.min(minMoves, dp[left][right]);
                }
            }
        }

        return minMoves;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline
        String[] instructions = new String[n];
        for (int i = 0; i < n; i++) {
            instructions[i] = sc.nextLine();
        }

        int result = minimumLegMovements(n, instructions);
        if (result != -1) {
            System.out.println(result);
        }
    }
    }

