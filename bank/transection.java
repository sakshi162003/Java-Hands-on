package bank;
import java.util.Scanner;
//transection using card
public class transection{
    public static void verfication(int card_no) {
      //HERE WE WILL CONNECT OUR BANK CARD DETAIL DATABASE THEN IT WILL CHEAK THE CARD NUMBER IS VALID OR NOT
      // FOR NOW WE TAKE RANDOM ONE NUMBER IF IT MATCH THE GO TO NEXT
      if(card_no == 12345) {
        whatyouwant();
      }
    }

    public static void whatyouwant() {
        Scanner td = new Scanner(System.in);
        System.out.println("CARD HOLDER NAME IS: VIGHNESH BAGAL");
      System.out.println("1) cheak balance \n\t 2) withdrow money \n\t 3)other services \n\t");
      int request =td.nextInt();
     switch (request) {
        case 1: vefied();
            
            break;
            case 2: vefied();
            
            break;
            case 3: vefied();
            
            break;
     
        default :System.out.println("Invalid request");
        System.out.println("plese collect your card");
            break;
     }
    }
public static void vefied() { //IN THAT FUNCTION WE WILL SHOW THE NAME OF CUSTOMER WHO INSERT THE CARD WHEN IT IS VERFY
    //THEN WE GET INPUT THE PASSWORD OF CARD TO GO TO NEXT TRANSIATION
    Scanner gc = new Scanner(System.in);
    System.out.println("CARD HOLDER NAME IS: VIGHNESH BAGAL");
    System.out.print("Insert your PIN : ");
    int password = gc.nextInt(); //HERE WE TAKE INPUT PASSWORD FROM CUSTOMER
    //ALSO USING CARD NUMBER WE WILL WRITE QUERY TO CHEK WHTEHER PASSOWRD IS RIGHT OR WORNG

    if(password ==1234){
        //HERE WE CHEKA PASSWORD IS RIGHT OR WRONG
        System.out.println("your Transection is procssing");
        cheaked();
    }
    else{
        System.out.println("password is wrong");
        System.out.println("Please take your card");
    }
}

public static void cheaked() {
System.out.println("your transection is copleted succesfully");
}
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("INSERT YOUR CARD NUMBER");
        int card_no= sc.nextInt(); 
        verfication(card_no);
        System.out.println("plese collect your card");
    }
}