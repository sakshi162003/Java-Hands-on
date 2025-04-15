package one;

public class patter {
    /*
    8
    8 8
    8 8 8
     */
    public static void main(String[] args) {
        int n=10;
        //row
        for(int i=1;i<=n;i++){
            //colum
            for(int j=1;j<=i-1; j++) {
                System.out.print("shantanu ");
            }
            System.out.println();
        }
    }
}
