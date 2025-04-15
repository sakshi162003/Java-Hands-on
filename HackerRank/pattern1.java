package HackerRank;

public class pattern1 {
    public static void main(String[] args) {
        int num =0;
        int num1 =20;

        for (int i=1;i<=4;i++) {
            for (int j=1; j<i;j++) {
                if(j ==1 && i >1) {
                    System.out.print("num1");
                }
                System.out.print("*");
            }
            for (int j=1;j<=1;j++) {
                System.out.print(num1+" ");
                num1+=10;
                num = num1;

            }

            System.out.println();
        }
    }
}
