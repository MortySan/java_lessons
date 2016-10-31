package lesson2_4;

import java.util.Scanner;

public class Main2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < (b+c) && b < (a +c) && c < (a + b)) {
            System.out.println("Triangle exists");
        } else {
            System.out.println("Invalid entry");
        }
    }
}
