package HackerRank;

import java.util.Scanner;
import java.lang.Math;



public class Exercise1 {

    public static void avg(int a, int b, int c){ //declaring funcation for finding average of 3 numbers
        int avg = (a+b+c)/3;
        System.out.print("avergare of three number is :"+avg);
    }

    //function for finding sum of 1 to n
    public static void sum(int n) {
        int sum =0;
        for (int i=1;i<=n;i++) {
            if (i % 2 ==1) {
                sum = sum+i;
            }
        }
        System.out.println("Sum of odd number is: "+sum);
    }

    //Finding gretest number in two number
    public static int greater() {
        Scanner gc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a =gc.nextInt();
        System.out.print("Enter second number: ");
        int b = gc.nextInt();
        int c;
        if(a<b){
            c = b;
        }
        else {
            c =a;
        }

        return c;
    }

    //circumfernce of circle
    public  static  void circumfernce(int redius){
        double circumfernce = 2 * 3.14 *redius;
        System.out.println("Circumfernce of Circle is : "+ circumfernce);
    }

    //eligble for vote or not
    public static void ElgiblityToVote(int age) {
        if ( age <= 18) {
            System.out.println("You are Not Elgible for voting");
        }
        else {
            System.out.println("You are Elgible for vote");
        }
    }
    //Entering number to take input form user and print count of postive negative and zeoro
    public static void EnterNumber() {
        System.out.println("Enter how many numbere do you want to input ");
        int input;
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int postive =0;
        int negative =0;
        int zero =0;
        for (int i= 1;i<=n;i++){
            input = sc.nextInt();

            if (input == 0){
                zero++;
            }
            else if(input <0) {
                negative++;
            }
            else if (input>0){
                postive++;
            }

        }

        System.out.println("Postive number count is: "+postive);
        System.out.println("Negative nymber count is: "+negative);
        System.out.println("zero number count is: "+zero);
    }
    //calculating power
    public static  void CaluclatePower(int x , int y) {
        System.out.println("Power of function is: "+Math.pow(x,y));

    }

    //finding greatest common divisor of n=2 number
    public static  void CommonDivisor(int p , int q) {
        int divisor =0;
        for(int i=1;i<=p && i<=q;i++) {
            if (p%i ==0 && q%i==0) {
                divisor =i;
            }
            System.out.println("Greates Common divsior "+p+ " and "+q+" is: "+divisor);
        }
    }
    public static void main(String[] args) {
      //  1.Enter 3 number from the user & make a function to print their average
        Scanner sc = new Scanner(System.in);
        System.out.println("Finding average of three number");
        System.out.print("Enter First number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b= sc.nextInt();
        System.out.print("Enter Thired number: ");
        int c= sc.nextInt();

        avg(a,b,c); // for avreage of 3 number calling funcation

        System.out.println();
        System.out.println();

        //2.write funcation to print sum of all odd number 1 to n
        System.out.print("Enter number n: ");
        int n = sc.nextInt();
        sum(n);

        System.out.println();
        System.out.println();
//3. write a function which takes in 2 number and return ther greate of those two
        System.out.println("Finding greater number of 2 number");
        System.out.println("gratest number between this two is: "+greater());

        System.out.println();
        System.out.println();

        //4. write a function that takes in the redius as input and returns the circumference of a circle.
       // formula 2*pi*r
        System.out.println("Finding circumfernce of circle");
        System.out.print("Enter redius of circle : ");
        int redius =sc.nextInt();
        circumfernce(redius);

        System.out.println();
        System.out.println();

        // 5. write a function that takes in age as input and return if ther person is eligible to vote or not. a person of age > 18 eligible to vote
        System.out.println("Elgiblity to vote");
        System.out.print("Enter your age : ");
        int age =sc.nextInt();
        ElgiblityToVote(age);

        System.out.println();
        System.out.println();

      //  6. write an infnite loop using do while condition
        int d = 2;
        do{
            System.out.println("Sun rha hai na tu");
        }while (d >1);

        System.out.println();
        System.out.println();

        //7. write a origran ti enter tge number till the user wanats and at the end it should display the cout of postive and negative and zeros entered;
       EnterNumber();

        System.out.println();
        System.out.println();

        // two number entered by user x and y write a function the value of one number raise to power of another ie.x res to y
        System.out.println("Calculating the power of number ");
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();
        CaluclatePower(x,y);

       // write a function that calculates the greatest common divisor of 2 numbers

        System.out.println();
        System.out.println();
        System.out.println("finding greatest common divisor if 2 number");
        System.out.print("Enter first number: ");
        int p = sc.nextInt();
        System.out.print("Enter second number: ");
        int q = sc.nextInt();
        CommonDivisor(p,q);

    }
    }

