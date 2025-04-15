package HackerRank;
import java.lang.String;

public class string {
    public static void main(String[] args) {
        //declaration
        String name ="Toney"; //scaning string we get it using .next and .nextline

        //concatanation of string
        String firstname="sahil";
        String lastname= "Bagal";
        String fullname = firstname+ " " + lastname;
        System.out.println(fullname);

        System.out.println();
        System.out.println();

        //length of string calculate using .length() function which is inbulid function
        System.out.println(fullname.length());


        System.out.println();
        System.out.println();

        //charAt function use for find or print particuler charter of string
        // delcation
        // NameOfString.charAt(IndexOfCharcter)

        for (int i=0;i<fullname.length();i++) {
            System.out.println(fullname.charAt(i));
        }



        System.out.println();
        System.out.println();

        //comparison of two string
        //declartion
        //FirstStringName.compareTo(SecondStringName)
        //their it cheak three condition "=","<",">"
        //it will made for most of the cases "==" are faild so this function will made
        String name1 = "Sahil";
        String name2 ="Sahil";
        if(name1.compareTo(name2) ==0) {
            System.out.println("String are equal");
        }
        else{
            System.out.println("String are not equal");
        }
        if (name1.equals(name2)) {
            System.out.println("Strings are equal");
        }
        System.out.println();
        System.out.println();
        //substring declartion
        //.substring(beging index, end index)
        System.out.println(fullname.substring(6, fullname.length())); //Bagal

        System.out.println();
        System.out.println();
        //Imuatable - Strings are Imu atable we cant change it value after declartion if want to change it create another strings
        for (int i=fullname.length()-1;i>=0;i--) {
            char reverse= fullname.charAt(i);
            System.out.println(reverse);
        }
    }
}
