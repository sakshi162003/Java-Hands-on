package HackerRank;

public class TilesRecursion {
    // Qs. Place Tiles of size 1xm in a floor of size nxm
    // n = 4, m = 2


    public static  int placeTiles(int n, int m) {
         if(n==m) {
             return 2;
         }
         if(n<m) {
             return 1;
         }
         //verticaly
        int verticalPlacment = placeTiles(n-m,m);

         // Horizontal
        int horizontalPlacment = placeTiles(n-1,m);

        return verticalPlacment+horizontalPlacment;
    }
    public static void main(String[] args) {
        int n=4; int m=2;
        System.out.println(placeTiles(n,m));

    }
}
