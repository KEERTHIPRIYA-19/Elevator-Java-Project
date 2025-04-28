package com.Elevator;
import java.util.Scanner;

public class ElevatorChallenge {

    static void automaticElevator() throws InterruptedException {
        Elevator elevator = new Elevator();
        elevator.lunchtimeElevatorRush();
        elevator.start();
    }

    static void manualElevator() throws InterruptedException {
        Elevator elevator = new Elevator();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter a starting floor (0 - 10): ");
            int start = sc.nextInt();

            System.out.println("Enter a destination floor (0 - 10): ");
            int end = sc.nextInt();

            elevator.callElevator(start, end);
            elevator.start();
        } finally {
            sc.close(); // Always close Scanner
        }
    }

    public static void main(String[] args) throws InterruptedException {
        manualElevator();
        // automaticElevator(); // You can uncomment to run automatic mode
    }
}
