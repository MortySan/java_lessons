package lesson3_1;

import java.util.Scanner;

public class Main3_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int col = sc.nextInt();
        int maxrow = 5;

        for (int i=1; i<=maxrow; i++) {
            for (int j=0; j<col; j++) {
                if (j%2 == 0) {
                    System.out.print("***");
                } else {
                    System.out.print("+++");
                }
            }
            System.out.println();
        }


    }
}
