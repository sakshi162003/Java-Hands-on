package one;

public class recursionproblem16 {
    //print all permutation of a string (all possible combination of letters)
    //"abc'
    public static void printpem(String str, String permutation) {
        if(str.length()==0) {
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++) {
            char currChar = str.charAt(i);
            //"abc" -> "ab"
            String newStr = str.substring(0, i) +str.substring(i+1);
            printpem(newStr,permutation+currChar);
        }
    }

    public static void main(String[] args) {
        String str ="abc";
        printpem(str, "");
    }
}
