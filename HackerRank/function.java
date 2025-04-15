package HackerRank;

import java.util.Scanner;

public class function {
    //1. make function to print your name
    public static void PrintMyName(String name) { //declarion of funtion
        System.out.println("I love "+name);
    }


    //make function to add 2 number
    public static void AddTwoNmber(int a,int b) {
        int sum = a +b;
        System.out.println("Sum of Two Number is: "+sum);
    }

    //make funcation to multiplay of two number return product of that two number
    public  static  int Product(int a, int b) {
        int product = a*b;
        return  product;
    }

    //calculate factorial using function
    public static void factorial(int a) {
        if(a<0) {
            return ;
        }
        int factorial =1;
        for(int i=a;i>=1;i++) {
            factorial = factorial*i;

        }
        System.out.println(factorial);
    }
    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        PrintMyName(name);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b= sc.nextInt();


        System.out.println();
        System.out.print("multiplication ot two number is:"+Product(a,b));

        factorial(a);

    }
}
