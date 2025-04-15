package HackerRank;

import java.util.Scanner;

public class calculater {
    public static void main(String[] args) {
        //calculater using switch statment

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operation which you wnat to do");
        System.out.println("Enter 1 for Addition \n Enter 2 for substaration \n Enter 3 for multiplication \n Enter 4 for Division ");
        int count= sc.nextInt();
        System.out.print("Enter first number: ");
        int a= sc.nextInt();
        System.out.print("Enter Second number: ");
        int b=sc.nextInt();

        switch (count) {
            case 1:int addition= a+b;
                System.out.print("Addition is:"+addition);
                break;
            case 2: int substration =a-b;
                System.out.print("substration is:"+substration);
                break;
            case 3: int mul =a*b;
                System.out.print("substration is:"+mul);
                break;
            case 4: int div =a/b;
                System.out.print("substration is:"+div);
                break;
            default:
                System.out.println("invalid opration");
        }
    }
}
