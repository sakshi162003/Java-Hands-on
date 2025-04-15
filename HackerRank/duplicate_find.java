package HackerRank;

import java.util.Arrays;

public class duplicate_find {
    public static void main(String[] args) {
        int arr[]= {1,1,2};
        int k=0;
        int res[] = new int[arr.length];

        for (int i =0;i<arr.length;i++) {
            for(int j =0;j<i;j++) {
                if(arr[i] == arr[j]) {
                   continue;
                }else {
                    res[k] = arr[i];
                    k++;
                }
            }
        }
        System.out.println(Arrays.toString(res));
    }
}