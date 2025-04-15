package HackerRank;

public class Aramstrong_number {
    public static void main(String[] args) {
        int num =153;
        int orginalNum = num;
        int sum =0;


        while (num > 0) {
            int digit = num % 10;
            sum += (digit *digit *digit); // Raise digit to power n
            num /= 10;
        }


        if(sum == orginalNum) {
            System.out.println("It is Armastrong Number: "+orginalNum);
        }
        else {
            System.out.println("Not Aramstrong");
        }

    }



}

