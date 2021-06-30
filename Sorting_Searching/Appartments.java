package Sorting_Searching;
import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Scanner;

public class Appartments {
    public static void main(String args[]){
        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int n = arr[0]; // number of applicanta
        int m = arr[1]; // size of appartment
        int k = arr[2]; // difference allowed

        int[] dApp = new int[n];
        for(int i=0;i<dApp.length;i++){
            dApp[i]=sc.nextInt();
        }
        int[] sApp = new int[m];
        for(int i=0;i<sApp.length;i++){
            sApp[i]=sc.nextInt();
        }
        int count =0;
        for(int i=0;i<dApp.length;i++){
            for(int j=0;j<sApp.length;j++){
                int diff1 = dApp[i]+k;
                int diff2 = dApp[i]-k;
                if(sApp[j]>=diff2 && sApp[j]<=diff1){
                    count++;
                }
            }

        }
        System.out.println(count);


    }
}