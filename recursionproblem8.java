package one;

public class recursionproblem8 {
    //pirnt a string in reverse "abcd"
    public static void printRev(int index, String str) {
        if(index ==0) {
            System.out.print(str.charAt(index));//print final character and the return
            return;
        }
        System.out.print(str.charAt(index)); //print character on string index
        printRev(index-1,str);// put index --
    }
    public static void main(String[] args) {
        String str = "abcd";
        printRev(str.length()-1, str);

    }
}
