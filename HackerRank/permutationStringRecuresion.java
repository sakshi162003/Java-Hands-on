package HackerRank;

public class permutationStringRecuresion {

    //permutation problem (possible combination)
    //abc

   public static void printperm(String str, String permutation) {
       if (str.length() ==0) {
           System.out.println(permutation);
           return;
       }

       for(int i=0;i<str.length();i++) {
           char currChar = str.charAt(i);
           //abc -> a

           String newStr = str.substring(0,i) +str.substring(i+1);
           printperm(newStr,permutation);
       }

   }

    public static void main(String[] args) {
        String str = "abc";
        printperm(str, "");
    }
}
