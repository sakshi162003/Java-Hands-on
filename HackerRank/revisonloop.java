package HackerRank;

import java.util.Scanner;

public class revisonloop {
    public static void main(String[] args) {
        //print sum of firt n natural number using for loop
        System.out.println("Enter n value");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sum =0;
        for(int i=0;i<n;i++){
            sum = sum+i;
        }
        System.out.println(sum);


        //print table using while loop
        System.out.println();
        System.out.println("Enter table first no:");
        int table =sc.nextInt();
        System.out.println("table is ");
        int i=0;
        while (i<=10) {
            System.out.println(table*i);
            i++;
        }

        System.out.println();
        System.out.println();
        //using do while print 1 to 10 number
        int j=0;
        do {
            System.out.println(j);
            j++;
        }while (j<=10);
    }


}
