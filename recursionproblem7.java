package one;

public class recursionproblem7 {
    // Tower of Hanoi
    // classic quction
    //rules
    //1.oly one disk transferd in 1 step
    //2.smailler desk are always kept on top of larger disks
    public static void towerOfHanoi(int n,String src, String Helper, String dest) {
        if(n==1) {
            System.out.println("transfer disk "+n+" fronm " +src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1,src, dest,Helper);
        System.out.println("transfer disk "+n+" fronm " +src+" to "+dest);
        towerOfHanoi(n-1,Helper,src,dest);
    }
    public static void main(String[] args) {
        int n=3;
        towerOfHanoi(n,"Source","Helper","Destination");
    }
}
