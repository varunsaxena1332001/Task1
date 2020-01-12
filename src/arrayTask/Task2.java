package arrayTask;

import java.util.Scanner;

public class Task2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = new int[10];
        insertValuesIntoArray(array);
        insertValueAtGivenIndex(array);
        boolean response = searchTheElement(array);
        if (response) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
        sortedArray(array);
    }

    public static void sortedArray(int[] array) {
        int swp;
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                if (array[i] > array[j]) {
                    swp = array[i];
                    array[i] = array[j];
                    array[j] = swp;
                }
            }
        }
    }

    public static boolean searchTheElement(int[] array) {
        System.out.println("enter the to find in the array");
        int value = sc.nextInt();
        boolean response = false;
        for (int i = 0; i < 10; i++) {
            if (array[i] == value) {
                response = true;
                break;
            }
        }
        return response;
    }

    /**
     * insertValueAtGivenIndex function is used to insert value at a particular index.
     */

    public static void insertValueAtGivenIndex(int[] array) {
        System.out.println("enter the value");
        int value = sc.nextInt();
        System.out.println("enter the index");
        int index = sc.nextInt();
        array[index] = value;
    }

    public static void insertValuesIntoArray(int[] array) {
        for (int i = 0; i < 9; i++) {
            array[i] = sc.nextInt();
        }
    }
}
