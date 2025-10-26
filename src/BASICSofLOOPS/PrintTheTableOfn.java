package BASICSofLOOPS;

import java.util.Scanner;
public class PrintTheTableOfn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

//        for (int i =1; i<=100; i++)
//            if (i %n==0)
//                System.out.println(i);

        for (int i = n; i <= n * 10; i += n) {
            System.out.println(i);

        }

    }
}


