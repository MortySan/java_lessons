package lesson1_2;

import java.util.Scanner;

public class Main1_2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();

        double p = (a + b + c)/2;

        System.out.println(p);

        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        System.out.println(s);

    }

}
