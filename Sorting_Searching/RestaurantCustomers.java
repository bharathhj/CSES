package Sorting_Searching;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Collections;
public class RestaurantCustomers {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0;i<n;i++){
                a[i]= sc.nextInt();
                b[i]= sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);
        int i=0;
        int j=0;
        int cur=0;
        int ma =0;
        while(i<n && j<n){
            if(a[i]<b[j]){
                cur += 1;
                i += 1;
            }else{
                cur -=1;
                j +=1;
            }

            if(ma<cur){
                ma = cur;
            }
        }
        System.out.println(ma);

    }
}
