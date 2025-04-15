package HackerRank;

import java.util.Scanner;

public class revison1 {
    public static void main(String[] args) {
        //basic structure

        //output show
        System.out.println("Hello world!");
        System.out.print("Hello world!");
        System.out.println("\n Hello world!\n");

        /*
        print patrring using println
        *
        **
        ***
         */
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");

        System.out.println("\n");

        //variable declaration
        int a=5;
        float b =15;
        double c=2222;
        char f ='a';
        boolean g ;
        long sf;


        //input

        Scanner sc = new Scanner(System.in);
        int like= sc.nextInt();

        //Question - take 2 variable as input and print sum of it

        int yes = sc.nextInt();
        int no= sc.nextInt();
        int sum = yes+no;
        System.out.println(sum);

        System.out.println("\n");

        //conditional statment

        if (yes<no) {
            System.out.println("yes u can do it");
        }
        else {
            System.out.println("NO you can't");
        }

        System.out.println();
        System.out.println();
        System.out.println();

        //get input age and cheak he is adulat or not using if else

        System.out.print("Enter age:");
        int age = sc.nextInt();
        if(age >18) {
            System.out.println("adult");
        }
        else if (age<=18) {
            System.out.println("not adult");
        }
        else{
            System.out.println("age is invalid");
        }
//condition statment SWITCH
        // get input find perfect welcome senetenece using switchs
        System.out.println("Enter numeber 1\t 2\t 3\t");
        int number = sc.nextInt();

        switch (number) {
            case 1 :
                System.out.println("Namste");
                break;

            case 2:
                System.out.println("Hello");
                break;
            case 3:
                System.out.println("ola");
                break;
            default:
                System.out.println("Invalid number");
        }

    }
}
