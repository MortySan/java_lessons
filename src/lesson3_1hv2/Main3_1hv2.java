package lesson3_1hv2;

import java.util.Scanner;

public class Main3_1hv2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


//        int w = sc.nextInt();
        int w = 4;
        int h = w*2 - 1;
        int halfN = h / 2;
        for (int i = 0; i < w*h; ) {

            int j = i % w ;
            int ii = i/w;
            if ( j == 0 ) {
                System.out.print("*");
            }

            int i1 = halfN - Math.abs(ii - halfN) + 1;
            if ( j < i1 -1) {
                System.out.print("*");
                i++;
            } else {
                System.out.println();
                i += w - j;
            }

        }

    }
}
