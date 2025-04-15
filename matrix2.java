import java.util.*;
public class matrix2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Rows of matrix");
    int row = sc.nextInt();
    System.out.println("Enter columan in matrix");
    int col=sc.nextInt();
    int arr[][]= new int[row][col];
    System.out.println("Enter matrix"+row+"x"+col);
    for(int i=0;i<row;i++) {
        for(int j=0;j<col;j++) {
            arr[i][j]=sc.nextInt();
        }
        System.out.println();
    }
    for(int i=0;i<row;i++) {
        for(int j=0;j<col;j++) {
            System.out.println(arr[i][j]+" ");
        }
    }
    }
}