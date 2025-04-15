package HackerRank;

public class patterns {
    public static void main(String[] args) {
        /*
        solid Rectangle
        *****
        *****
        *****
        *****
         */

        int n=4;
        int m=5;
        //outer loop for columan
        for (int i=1; i<n;i++){
            //ineer loop for row
            for(int j =1;j<=m;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        /*
        Hallow rectangel pattern
        *****
        *   *
        *   *
        *****
         */
        //outer loop
        for (int i=1;i<=n;i++) {
          //inner loop
          for (int j=1; j<=m; j++) {
              if(j==1 || i==1 || j==m ||i ==n) { //Here we have logic when i or j on that given condition their will star is present in another location is blank so we use it
                  System.out.print("*");
              }
              else {
                  System.out.print(" ");
              }
          }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        /*
        half peramind
        *
        **
        ***
         */
        //outer loop
        for(int  i=1; i<=n; i++) {
            //ineer loop
            for (int j =1; j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        /*
        reverse permind
        ****
        ***
        **
        *
         */

        //outer loop
        for (int i=n; i>=1; i--) {
            //inner loop
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        /*
        half inverted permind n=3-1 =2
          *
         **
        ***
         */

        //outer loop
       for(int i=1;i<=n;i++) {
           //spaces
           for(int j=1;j<=n-i;j++){
               System.out.print(" ");
           }
           //printing star
           for (int j=1;j<=i;j++) {
               System.out.print("*");
           }
           System.out.println();
       }

        System.out.println();
        System.out.println();


        /*
        print patternt number permind
        1
        1 2
        1 2 3
         */
        //outer loop
        for (int i=1;i<=n;i++) {
            //inner loop print number
            for(int j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        /*
        inverted hald perimaind with number
        1 2 3
        1 2
        1
         */
        for (int i=n;i>=1;i--) {
            //inner loop print number
            for(int j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        /*
        flogds traingle
        1
        2 3
        4 5 6
         */
        //outer loop
        int number=1;
        for(int i=1; i<=n;i++) {
            for (int j=1;j<=i;j++) {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
        System.out.println();  System.out.println();
        /*
        0-1 Traingle
        1
        01
        101
        0101
         */
        //even =1 odd=0
        //outer loop
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                int sum =i+j;
                if(sum % 2 ==0) {
                    System.out.print("1" + " ");
                }
                else {
                    System.out.print("0"+ " ");
                }
            }
            System.out.println();
        }


        // print heart

        
    }

}
