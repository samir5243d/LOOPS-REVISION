package BASICSofLOOPS;

import java.util.Scanner;


public class DisplayAp {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int n= sc.nextInt();

        for (int i=1; i<=2*n-1; i+=2){
            System.out.println(i);
        }

    }
}
