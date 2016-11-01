package lesson3_2h;


public class Main3_2h {
    public static void main(String[] args) {

        int flag = 0;
        System.out.print("2 ");
        for ( int i = 3; i <= 100; i+=2 ) {

            for (int j=3; j*j <= i; j+=2) {

                if (i % j == 0) {
                    flag +=1;
                }
            }

            if ( flag == 0 ) {
                System.out.print(i+" ");
            }
            flag = 0;
        }

    }
}
