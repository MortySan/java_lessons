package lesson2_1;

import java.util.Scanner;

public class Main2_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (a > b && a > c && a > d) {
            System.out.println(a);
        } else if (b > c && b > d) {
            System.out.println(b);
        } else if (c > d) {
            System.out.println(c);
        } else {
            System.out.println(d);
        }



    }
}
