package one;

public class recursionproblem11 {
    //move all'x' to the end of the string
    //"axbcxxd"
    public static void moveAllx(String str,int idx,int count,String newstring) {
        if(idx == str.length()) {
            for(int i=0;i<count;i++) {
                newstring +="x";

            }
            System.out.println(newstring);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar=='x') {
            count++;
            moveAllx(str,idx+1,count,newstring);
        }
        else {
            newstring+=currChar; //newString = newString + currChar
            moveAllx(str, idx+1,count,newstring);
        }
    }

    public static void main(String[] args) {
        String str ="axbcxxd";
        moveAllx(str,0,0,"");
    }
}
