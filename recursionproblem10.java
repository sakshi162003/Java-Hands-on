package one;


public class recursionproblem10 {
    //check if an array is sorted(Sftrictly incresing) {1,2,3,4,5}
    public static boolean isSorted(int arr[],int idx) {
        if(idx == arr.length-1) {
            return true; //base case
        }
        if(arr[idx] >= arr[idx+1]) {
            //array is sorted till now
            return false;
        }
        else
        {
            return isSorted(arr, idx+1);
        }
     }

    public static void main(String[] args) {
        int arr[] ={1,2,3,4};
        System.out.println(isSorted(arr,0));
    }
}
