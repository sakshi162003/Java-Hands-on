package HackerRank;

public class stringpalndrom {
    //palendrom is thing where we compare string with it's reversal from and cheak whether reverse from and normal form are equal to each other
    public static boolean isPlandrom(String str) {
        //create one string to store reverse of string
        String rev ="";

        // create one boolean value which indicate given string is not equal to each other
        boolean ans = false;

        //loop for store the all value of string in reverse string format in that rev string
        // it is sum like method where we add firstly rev value and front of that we add str.charAt value
        for (int i=str.length()-1;i>=0;i--) {
            rev = rev+str.charAt(i);
        }


// cheaking given string are equal to each other using compare to function
        if (str.equals(rev)) {
            ans = true;
        }
// return ans which have value to look at given function will cheaked the string are palendrom or not
        return ans;
    }


    public static void main(String[] args) {
        // Input string
        String str = "12321";

        // Convert the string to lowercase
        // we convert it in lower case becouse in normal string case we cant match it becouse some value in uppar case and some in lower
        str = str.toLowerCase();
        boolean palndrom = isPlandrom(str); // calling function and store return value on it
        System.out.println(palndrom);// print that function
    }
}
