package one;

public class recursionproblem17 {
    //count total paths in a maze to move from(0,0) to (n,m)
    //n=3,m=3
    //condition move to right or move to downwords  0
    public static int coutPath(int i,int j,int n, int m) {
        if(i==n || j==m) {
            return 0;
        }
        if(i==n-1 && j==m-1) {
            return 1;
        }
        //move downword
        int downPath = coutPath(i+1,j,n,m);

        //move to right
        int rightPath = coutPath(i,j+1,n,m);

        return downPath+rightPath;
    }

    public static void main(String[] args) {
        int n=3,m=3;
       int totalPaths= coutPath(0,0,n,m);
        System.out.println(totalPaths);
    }
}
