package HackerRank;
class FindDuplicates {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 4, 4, 5, 5, 5};
        int n = arr.length;

        System.out.println("Duplicate elements in the array:");

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // Check if this element has appeared before
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If it's a new duplicate, print it
            if (!isDuplicate) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.println(arr[i]);
                        break; // Break to avoid multiple prints of the same duplicate
                    }
                }
            }
        }
    }
}