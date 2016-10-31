package lesson1_1;

import java.util.Scanner;

public class Main1_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;
        number = sc.nextInt();

        int a = 0;
        a = number/10000;
        System.out.println(+a);
        a = number/1000%10;
        System.out.println(+a);
        a = number/100%10;
        System.out.println(+a);
        a = number/10%10;
        System.out.println(+a);
        a = number/1%10;
        System.out.println(+a);


    }


}