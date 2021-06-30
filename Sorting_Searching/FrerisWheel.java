package Sorting_Searching;

import java.util.Arrays;
import java.util.HashSet;

public class FrerisWheel {
    public static void main(String args[]){
        int n = 10;
        int x = 20;

        int[] arr = {5 ,9 ,6 ,5 ,8 ,9 ,10 ,6 ,5 ,6};

        Arrays.sort(arr);

        int sum = 0;
        int count = 0;
        int r = arr.length-1;
        int l = 0;
        while(l<r){
            sum = arr[l]+arr[r];
            if(sum<=x) {
                count++;
            }else{
                if(arr[l]<=x){
                    count++;
                }
                if(arr[r]<=x){
                    count++;
                }
            }
            r--;
            l++;
        }
        System.out.println(count);
    }
}
