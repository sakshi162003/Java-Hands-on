package one;

public class recursionproblem13 {
    //print all the subsequences of a string
    //"abc"
    //imp
    public static  void subsequece(String str, int idx, String newString) {
        if(idx== str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        //to be
        subsequece(str,idx+1,newString+currChar);
        //not to be
        subsequece(str, idx+1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        subsequece(str,0,"");
    }
}
