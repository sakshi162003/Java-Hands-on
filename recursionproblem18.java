package one;

public class recursionproblem18 {
    //place Tiles of Size 1xm in a floor of size nxm
    //n=4,m=2
    public static int placeTiles(int n,int m) {
        if(n ==m) {
            return 2;
        }
        if(n<m) {
            return 1;
        }
        //vertically
        int vertPlacements = placeTiles(n-m,m);
        //horizontaly
        int horPlcements = placeTiles(n-1, m);

        return vertPlacements+horPlcements;
    }

    public static void main(String[] args) {
        int n=4,m=2;
        System.out.println(placeTiles(n,m));

    }
}
