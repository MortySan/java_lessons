package lesson3_2;

import java.util.Scanner;

public class Main3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }

        System.out.println(number+"! = "+fact);


    }
}
