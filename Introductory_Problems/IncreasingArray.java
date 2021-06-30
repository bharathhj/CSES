package Introductory_Problems;

import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        int pre;
        int diff = 0;
        int count = 0;
        for(int i=1;i<arr.length;i++){
            pre = arr[i-1];
            if(arr[i]<pre){
                diff = Math.abs(arr[i]-pre);
                count = count + diff;
            }
        }
        System.out.println(count);
    }
}
