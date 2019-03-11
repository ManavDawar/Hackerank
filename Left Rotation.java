import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }


        reverse(a,0,d-1);
        reverse(a,d,n-1);
        reverse(a,0,n-1);

        for(int val:a){
            System.out.print(val+" ");
        }
        scanner.close();
    }


    public static void reverse(int[] arr,int left ,int right){

        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;

        }


    }
}
