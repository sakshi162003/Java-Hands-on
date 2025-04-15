package one;

public class recursionproblem3 {
    //print factorial of a number n
    public static int printFactorail(int n) {
        if(n==1) {
            return 1;
        }
      int fact_nm1 = printFactorail(n-1);
      int fact_n=n*fact_nm1;
      return fact_n;
    }

    public static void main(String[] args) {
        int n=5;
        int ans= printFactorail(n);
        System.out.println(ans);
    }
}
