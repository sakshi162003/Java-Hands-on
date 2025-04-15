package one;

public class factorial_using_recursion {
    //crate function to caluculate factorial
    //logic find factorial using recursion suppose we want 3 factorail = 3*2!(mens we wnat to find n-1 factorial)

    public static int fact(int n) {
        if(n==1 || n==0) {
            return 1;
        }
        int fact_nm1 = fact(n-1); // recusive call function //it work as increment decrement oprator
        int fact_Nnumbers = n*fact_nm1;
        return fact_Nnumbers;
    }

    public static void main(String[] args) {
        int n=5;
        int ans = fact(n);
        System.out.println(ans);
    }
}
