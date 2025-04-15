package HackerRank;


//based on recursion and backracking
public class totalpaths {
    //count total paths in a matrix to move from (0,0) to (n,m)


    public static int countPaths(int n, int m, int i, int j) {
        //base condintion
        if(i==n || j==m) {
            return 0;
        }
        if(i ==n-1 && j==m-1) {
            return 1;
        }
      //move to downword
        int donwPath = countPaths(n,m,i+1,j);

        //move to right
        int rightPath= countPaths(n,m,i,j+1);

        return donwPath+rightPath;
    }
    public static void main(String[] args) {
        int n=3; //row
        int m=3; //columan
        int totalPaths = countPaths(n,m,0,0);
        System.out.println(totalPaths);
    }
}
