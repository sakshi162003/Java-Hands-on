import java.util.Scanner;

public class ganesh {
    public static void main(String[] args) {
        int r,c;
        int arr[][]=new int[2][2];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 2*2 Mtrix");
        for(r=0;r<2;r++){
            for(c=0;c<2;c++){
                arr[r][c]=sc.nextInt();
            }
        }
        for(r=0;r<2;r++){
            for(c=0;c<2;c++){
                System.out.println("\t"+arr[r][c]);
            }

        System.out.println("");
    }}

}