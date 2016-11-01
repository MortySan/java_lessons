package lesson3_4;


import java.util.Scanner;

public class Main3_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int h = sc.nextInt();

        for (int i = 0; i < h; i++) {
            System.out.print("*");

            for (int j = 1; j < w -1; j++) {
                if (i==0||i==h-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("*");
        }

    }
}
