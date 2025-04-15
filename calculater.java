import java.util.*;

public class calculater {
    public static void main(String[] args) {
    int a =88;
    int b =95;
    System.out.println("Maximum number is: "+Math.max(a, b));
    System.out.println("minmum number is: "+Math.min(a, b));
    System.out.println("square root of a is: "+Math.sqrt(a));
    System.out.println("square root of b is: "+Math.sqrt(b));
    System.out.println("Addition of two number is: "+Math.addExact(a, b));
    System.out.println("multplication of two number is: "+Math.multiplyExact(a, b));
    System.out.println("substaraction of two number is: "+Math.subtractExact(a, b));
    System.out.println(Math.pow(a, b));
    
    }  
}