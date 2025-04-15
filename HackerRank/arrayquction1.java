package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class arrayquction1 {
    //1) find the largest number in array
    public static void arrayMaximum(int arr[]) {
        int maximum = 0;
        int second = 0;
        for (int i =0;i<arr.length;i++) { //use in unsorted array to find maximum
            //chaking value using loop
            if (maximum < arr[i]) {

                maximum =arr[i];

            }
            if (arr[i] > second && second !=maximum) {
                second = arr[i];
            }
        }

        System.out.println("maximum number in array is another way: "+maximum);
        System.out.println("second largest number is: "+second);
    }


    //2) Find the smallest number in an array
    public static void arrayMinimum(int arr[]) {
        int smallest = arr[0];
        for (int i =1;i<arr.length;i++) { //use in unsorted array to find maximum
            //chaking value using loop
            if (smallest < arr[i]) {

                smallest =arr[i];

            }
        }

        System.out.println("maximum number in array is another way: "+smallest);
    }

    //Print Array(intgerType)
    public static void printArray(int arr[]) {
        //printing integer type array
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }


    //Scanning Array(intger Type)
    public static void ScanArray(int arr[]) {
        //input array
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

    }


    public static void reversArray(int arr[]) {
        for (int i =arr.length-1;i>-1;i--) { //reverse array
            System.out.println(arr[i]);
        }
    }


    //Rearrange the array in increasing - decreasing order
    public static void RearrangeArray(int arr[]) {
        //bubble sort decresing order
        for (int i=0;i< arr.length;i++) {
            for (int j=0;j<arr.length;j++) { //nasted loop for comparing elements
                if(arr[i]>arr[j]) { // arr[i] >arr[j] then swap (replace The element) if you changed '>' this sign into '<' this arry will sorted in incrasing order
                    //swap
                    int temp =arr[j];
                    arr[j] =arr[i];
                    arr[i] =temp;

                }
            }
        }
        printArray(arr);
    }


    //find Smallest Number in array
    public static void secondSmallestandLargest(int arr[]) {

            //bubble sort decresing order
            for (int i=0;i< arr.length;i++) {
                for (int j=0;j<arr.length;j++) { //nasted loop for comparing elements
                    if(arr[i]>arr[j]) { // arr[i] >arr[j] then swap (replace The element) if you changed '>' this sign into '<' this arry will sorted in incrasing order
                        //swap
                        int temp =arr[j];
                        arr[j] =arr[i];
                        arr[i] =temp;

                    }
                }
            }
        System.out.println("Second largest number is : "+ arr[1]); //array sorted in desending order
        System.out.println("Second smallest number is: "+ arr[arr.length-2]);
    }


    //count the frequency of each element in an array
    public static void arrayFrequency(int arr[]) { //Frequncy mins how many time number is in the array
        boolean visited[] = new boolean[arr.length]; //boolean array which have legth equal to array which chaek give element vistind once onlay after that it will skipp
        Arrays.fill(visited,false); //fill value in all array element is visted is false
//traversing array
        for (int i=0;i<arr.length;i++) {

            if(visited[i] == true) //if once the element will visted then it skiip the element work as base case
                continue;


            int counter =1; // decler frequncy first all element is 1
            for(int j=i+1;j<arr.length;j++) {
                if (arr[i] == arr[j]) { //condition chak elemet is repated or not
                    visited[j] = true; // when element is visted then change its value flase to true
                    counter++; //incresing counter
                }
            }
            System.out.println(arr[i] + " Frequency is : "+counter);
        }
    }

    public static void calculateSum(int arr[]) {
        int sum =0;
        for (int i=0;i<arr.length;i++) {
            sum = sum+arr[i];
        }

        System.out.println(sum);
    }

//find the average of all elements in array
    //for that we make sum of array elements and divede it by arrys length
    public static double aveageArray(int arr[]) {
        int sum=0; //sum declartion
        //traversing in array
        for (int i=0;i<arr.length;i++) {
            sum = sum+arr[i]; //calulating sum
        }
        double average = sum/arr.length; // clculating avrage of all element in array

        return average; //return avrage
    }

    //find the median of the given array

    public static double median(int arr[]) {
        //First Sort array
        Arrays.sort(arr);

        //cheak for even case
        if(arr.length % 2 !=0){
            double evenmedian = arr.length/2; //formula even
            return evenmedian;
        }
        else {
            double median = ((arr.length-1)/2) + ((arr.length/2)/2.0); //formula for odd
            return median;
        }
    }



    //main method
    public static void main(String[] args) {
        //find the samllest number in array
        int arr[] = {2,12,6,45,3}; //declar array

        //sort array
        Arrays.sort(arr);
        //finding maximum in array
        System.out.println("smallest number in array is : "+ arr[arr.length-1]); //array is sorted becouse of that first number of array is sorted

        //another way maximum number in array
        arrayMaximum(arr);

        //finding smallest number in array
        arrayMinimum(arr);


        //used in sorted array
        System.out.println("minmum number in array using another method is : "+arr[0]);

        //reverser a given array
        int arr1[] ={12,55,2,88,88};
        //revers array using for loop
        System.out.println("Reverse Array is: ");
        reversArray(arr1); //passing array by calling function


        System.out.println("Rearged array is: ");
        RearrangeArray(arr); //calling Rearrange Array Function show array in decresing order


        //Printing secondSmallest and Second Largest element
        secondSmallestandLargest(arr1); //calling function to print secod smallest and second largest element in array

        //calculed sum of array elemet
        System.out.println("sum of array is: ");
        calculateSum(arr);

        //calculating frequncy of each element in array (How many time repated in array)
        System.out.println("frequency of each element");
        arrayFrequency(arr1);

        //find avearge of all elements in array
        System.out.println("Average of All elements in array: "+aveageArray(arr));

        //find the median of given array (samjale nhi ajun)
        System.out.println("Median of given array is : "+median(arr));





    }
}

