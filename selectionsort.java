package one;

public class selectionsort {
    public static void main(String[] args) {
        //selaction sort
        //given array 7 8 3 1 2
        int arr[] ={7,8,3,1,2 };
        //selection sort
        for(int i =0;i<arr.length-1;i++) {
            int samllest =i;
            for(int j =samllest;j<arr.length;j++) {
                if (arr[samllest] > arr[j]) {
                    samllest =j;
                }
            }
            int temp= arr[samllest];
            arr[samllest] =arr[i];
            arr[i] =temp;
        }
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+ " ");
        }

    }
}
