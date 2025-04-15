package HackerRank;
import java.lang.StringBuilder;
public class stringbulider {
    public static void main(String[] args) {
        //it is mainlay created for the addition and deltion operation in string which is time taking in string but not in StringBUlider
        //declartion
        StringBuilder sb=  new StringBuilder("Toney");
        //we can perfrom all severl opration which is perform in string

        //setcharAt function
        sb.setCharAt(0,'s'); //user to replace the charter of string

        System.out.println(sb);


        System.out.println();
        System.out.println();

        //Insert in string
        sb.insert(0,'n');
        System.out.println(sb);

        System.out.println();
        System.out.println();

        //delete from stringt
        sb.delete(0,2); // write index of delete element
        System.out.println(sb);


        System.out.println();
        System.out.println();

        //append - add char at last
        sb.append('s');
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}
