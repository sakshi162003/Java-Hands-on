//take input array from user and find x number from it
import java.util.*;;
public class practiceQs1{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[] =new int[5];
        for(int i=0; i<=5;i++) {
            arr[i]= sc.nextInt();

        }
        System.out.println("Enter number which u want to search");
        int x = sc.nextInt();
        for(int i=0;i<=5;i++) {
            if(arr[i]==x) {
                System.out.println("Number is found");
                System.out.println(arr[i]);
            }
        }
    }
}