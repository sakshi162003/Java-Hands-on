package HackerRank;

import java.util.Scanner;

public class sakshi2 {
    public static String Sakshiiii(String decison) {
        String yes ="yes";
        String no ="no";
        String sakshidecison ="";
        if (decison.compareTo(yes)==0) {
            sakshidecison+=yes;
        }
        else {
            sakshidecison+=no;
        }

        return sakshidecison;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sakshi Night drive la jayche ka nhi");
        String input = sc.nextLine();
        System.out.println( Sakshiiii(input));
    }
}
