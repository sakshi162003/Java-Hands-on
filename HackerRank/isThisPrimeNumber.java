package HackerRank;

public class isThisPrimeNumber {
    public static void main(String[] args) {
        int n =20;

        boolean isPrime = true;

        for(int i =2;i<n;i++) {
            if(n % i ==0) {
                isPrime = false;
            }
        }

        System.out.println(isPrime);
    }
}
