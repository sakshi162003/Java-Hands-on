package one;

public class recursionproblem9 {
    //fint the 1st and last occurance of an element in string
    //"abaacdaefaah
    public static int first =-1;//decler 1st and last -1 becouse when our function change it value we well understand it
    public static int last =-1;
    public static  void findOccurance(String str, int idx, char element) {
        if(idx == str.length()) { // for stop recursion
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar==element) {
            if(first ==-1) { // for update first index
                first=idx;
            }
            else {
                last =idx;//update last index
            }
        }
        findOccurance(str, idx+1,element);
    }

    public static void main(String[] args) {
        String str ="abaacdefaaah";
        findOccurance(str,0,'a');
    }
}
