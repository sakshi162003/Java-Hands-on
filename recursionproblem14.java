package one;

import java.util.HashSet;

public class recursionproblem14 {
    //print all the uniqure subsequececes of a strring
    //solven by Hashset
    //"aaa"
    public static  void subsequece(String str, int idx, String newString,HashSet<String> set) {
        if(idx== str.length()) {
            if(set.contains(newString)) {
                return;

            }
            else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currChar = str.charAt(idx);
        //to be
        subsequece(str,idx+1,newString+currChar,set);
        //not to be
        subsequece(str, idx+1, newString,set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequece(str,0,"",set);
    }
}
