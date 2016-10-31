package lesson2_2;

import java.util.Scanner;

public class Main2_2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int maxRoom = 144;
        int maxFloor = 9;
        int room = sc.nextInt();
        int access = 1;

        if (room > 0 && room <= maxRoom) {
            int floor = (room - 1)/4 + 1;
            if (floor <= maxFloor ) {
                System.out.println("Floor " +floor);
                System.out.println("Access " +access);
            } else if (floor <= maxFloor * 2) {
                floor -= maxFloor;
                access += 1;
                System.out.println("Floor " +floor);
                System.out.println("Access " +access);
            } else if ( floor <= maxFloor * 3){
                floor -= maxFloor*2;
                access += 2;
                System.out.println("Floor " +floor);
                System.out.println("Access " +access);
            } else {
                floor -= maxFloor * 3;
                access +=3;
                System.out.println("Floor " +floor);
                System.out.println("Access " +access);
            }

        } else {
            System.out.println("Invalid room number");
        }
    }
}
