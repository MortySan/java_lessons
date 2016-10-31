package lesson2_3;

import java.util.Scanner;

public class Main2_3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if (year%4 == 0) {
            if ( year%400 == 0) {
                System.out.println("366");
            } else if (year%100 == 0) {
                System.out.println("365");
            } else {
                System.out.println("366");
            }

        } else {
            System.out.println("355");

        }
    }

}
