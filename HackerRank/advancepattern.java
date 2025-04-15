package HackerRank;

public class advancepattern {
    public static void main(String[] args) {
        int n = 5;

        //Butterfly pattern
        /*


         *   *
         ** **
         *****
         ** **
         *   *


         */
        //upper half
        for (int i = 1; i <= n; i++) {
            //1st part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for (int i = n; i >= 1; i--) {
            //1st part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        /*
        solid rhombus
            ****
           ****
          ****
         */
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        /*
        Number permind
           1
          2 2
         3 3 3
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        /*
        palindromic pattern
            1
          2 1 2
        3 2 1 2 3
         */

        //outer loop
        for (int i=1;i<n;i++){
//spaces
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            //first half
            for(int j =i;j>=1;j--) {
                System.out.print(j);
            }
            //second half
            for (int j=2;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        //Butterflay pattern
        for (int i =1;i<=n;i++) {
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }

}
