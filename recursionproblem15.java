package one;

public class recursionproblem15 {
    //print keypad combination
    /*
    0->.
    1->abc
    2->def
    3->ghi
    4->jkl
    5->mno
    6->pqrs
    7->tu
    8->vwx
    9->yz

     */
    public static String[] keypad ={".","abc", "def","ghi", "jkl", "mno","pqrs", "tu", "vwx","yz"};
    public static void printCombo (String str, int idx, String combiation) {
        if(idx == str.length()) {
            System.out.println(combiation);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping =keypad[currChar -'0'];
        for(int i=0;i<mapping.length();i++) {
            printCombo(str, idx+1,combiation+mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str ="23";
        printCombo(str,0,"");
    }
}
