package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3; // Number of disks
        char fromRod = 'A'; // Source rod
        char toRod = 'C'; // Destination rod
        char auxRod = 'B'; // Auxiliary rod
        System.out.println("The sequence of moves involved in the Tower of Hanoi are:");
        towerOfHanoi(n, fromRod, toRod, auxRod);
    }
    public static void towerOfHanoi(int n, char fromRod, char toRod, char auxRod) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + fromRod + " to rod " + toRod);
            return;
        }
        towerOfHanoi(n - 1, fromRod, auxRod, toRod);
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
        towerOfHanoi(n - 1, auxRod, toRod, fromRod);
    }
}
