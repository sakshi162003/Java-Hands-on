package one;

public class recursionproblem5 {
    //print x res n (stack height =n)
    public static int calcpower(int x, int n) {
        if(n==0) {
            return 1;
        }
        if(x==0) {
            return 0;
        }
        int xPownm1 = calcpower(x,n-1);
        int xpown =x*xPownm1;
        return xpown;
    }
    public static void main(String args[]) {
        int x=2, n=5;
        int ans =calcpower(x,n);
        System.out.println(ans);
    }
}
