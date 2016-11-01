package lesson3_1hv2;

import java.util.Scanner;

public class Main3_1hv2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int w = sc.nextInt();
        int h = w*2 - 1;

        for (int i = 0; i < w*h; i++) {

            int j = i%w;

            if ( j < ( w/2 - Math.abs(i - w/2) +1) ) {
                System.out.print("*");
            } else {
                System.out.println();
                i += w - j;
            }

        }

    }
}
