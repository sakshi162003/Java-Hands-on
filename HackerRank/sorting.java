package HackerRank;

public class sorting {

    public static void BubbleSort(int arr[]) {

        //Bubble sort
        // using n-1
        // time coplexity = 0(n^2)
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {  // start from zero  -i becouse the number which sort equal to i then for another loop we skip it
                if(arr[j] > arr[j+1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;

                }
            }


        }
        printArray(arr);

    }


    public static void SelectionSort(int arr[]) {
        //selection sort
        // time coplexity 0(n^2)
        for(int i=0;i<arr.length-1;i++) { // getting first number of array
            int smallest =i; //consider as samlllest element in array
            for(int j=i+1;j<arr.length;j++) { // get next element to compare
                if(arr[smallest] >arr[j]) { //cheak whther smallest element is greter than another element (comparision between two elements)

                   smallest =j;
                }
            }
            //swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        printArray(arr);

    }

    public static void insertionSort(int arr[]) {

        //insertion sort
        for(int i=1;i<arr.length;i++){ //consider i=0 index is sorted
            int current = arr[i]; //declet current element location
            int j = i-1; // consider arr 0 index as j
            while (j >=0 && current< arr[j]) { //loop for making space
                arr[j+1] = arr[j];
                j--;
            }

            //placment
            arr[j+1] = current; //place the elemet in right postion
        }
        printArray(arr);
    }
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Sorting in Assending order
        // array - 7 8 3 1 2
        int arr[] = {7, 8, 3, 1, 2};

        System.out.println("Sorting by Bubble Sort : ");
        BubbleSort(arr);
        System.out.println("Sorting by Selection Sort : ");
        SelectionSort(arr);
        System.out.println("Sorting by Insertion Sort : ");
        insertionSort(arr);

    }
}
