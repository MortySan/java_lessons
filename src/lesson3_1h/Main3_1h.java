package lesson3_1h;

import java.util.Scanner;

public class Main3_1h {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        int w = sc.nextInt();

        int h = w*2 - 1;

        for (int i =1; i <= h; i++ ) {

            for (int j = 1; j < w; j++) {

                if (i <= w && j == i) {
                    break;
                } else  if (i >= w && j == h - i + 1 ) {
                    break;
                } else {
                    System.out.print("*");
                }

            }

            System.out.println("*");
        }

    }
}
