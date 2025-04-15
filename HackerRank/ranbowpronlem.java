package HackerRank;

import java.util.Scanner;

public class ranbowpronlem {

    /*
    write program which get input colors and show output color for indivdual proparty of color using function
     */

    public static void coloron (String color) {
        if(color.equals ("red")) {
            System.out.println("This is RED color of blood");

        }
        else if(color.equals ("blue")) {
            System.out.println("see is mine");
        }
        else if(color.equals("green")){
            System.out.println("This is a green colour of nature");
        } else if (color.equals ("white")) {
            System.out.println("this is the colour of peace");

        } else if (color.equals("orange")){
            System.out.println("orange ");
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter a Color : ");
        Scanner sc = new Scanner(System.in);
        String color = sc.nextLine();
        coloron(color);


    }
}
