package Sorting_Searching;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ConcertTickets {
    public static void main(String args[]){
        int t = 10;
        int c = 10;
        LinkedList<Integer> priceOfTicket = new LinkedList<>();
        int temp;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<t;i++){
            temp = sc.nextInt();
            priceOfTicket.add(temp);
        }

        LinkedList<Integer> priceOfCustomer = new LinkedList<>();
        for(int i=0;i<c;i++){
            temp = sc.nextInt();
            priceOfCustomer.add(temp);
        }
        temp = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for(int ele : priceOfCustomer){
            if(priceOfTicket.contains(ele)){
                result.add(ele);
                priceOfTicket.remove(priceOfTicket.indexOf(ele));
            }else if(priceOfTicket.contains(ele-1)){
                result.add(ele-1);
                priceOfTicket.remove(priceOfTicket.indexOf(ele-1));
            }else{
                result.add(-1);
            }
        }
        System.out.println(result);
    }
}

