package BASICSofLOOPS;

import java.util.Scanner;


public class DisplayAp2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner (System.in);

        int n= sc.nextInt();
//
//        for (int i=4; i<=3*n+1; i+=3){
//            System.out.println(i+" ");
//        }

//      this is better code and relevent and usefull for calculating geometric mean also

        int a=4, d=3;

        for (int i=1; i<=n; i++){
            System.out.println(a+" ");
            a+=d;

        }



    }


}
