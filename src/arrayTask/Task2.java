package arrayTask;

import java.util.Scanner;

public class Task2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = new int[10];
        insertValuesIntoArray(array);
        insertValueAtGivenIndex(array);

    }

    /**
     * insertValueAtGivenIndex function is used to insert value at a particular index.
     */

    public static void insertValueAtGivenIndex(int[] array) {
        int value = sc.nextInt();
        int index = sc.nextInt();
        array[index] = value;
    }

    public static void insertValuesIntoArray(int[] array) {
        for (int i = 0; i < 9; i++) {
            array[i] = sc.nextInt();
        }
    }
}
