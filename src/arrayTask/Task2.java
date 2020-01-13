package arrayTask;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    //static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);
        printValueOfArray(array);
        insertValuesIntoArray(array, sc);
        printValueOfArray(array);
        System.out.println("enter the index");
        int index = sc.nextInt();
        System.out.println("enter the value");
        int value1 = sc.nextInt();
        insertValueAtGivenIndex(array, value1, index);
        //insertValueAtGivenIndex(array,sc.nextInt(),sc.nextInt());
        printValueOfArray(array);
        searchTheElement(array, sc);
        sortedArray(array);
        printValueOfArray(array);
    }


    public static void printValueOfArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void sortedArray(int[] array) {
        Arrays.sort(array);
    }

    public static void searchTheElement(int[] array, Scanner sc) {
        System.out.println("enter the to find in the array");
        int value = sc.nextInt();
        boolean response = false;
        for (int i = 0; i < 5; i++) {
            if (array[i] == value) {
                response = true;
                break;
            }
        }
        response(response);
    }

    public static void response(boolean response) {
        if (response) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }

    /**
     * insertValueAtGivenIndex function is used to insert value at a particular index.
     */

    public static void insertValueAtGivenIndex(int[] array, int value1, int index) {


        shiftRight(array, value1, index);
        printValueOfArray(array);
    }

    public static void shiftRight(int[] array, int value, int index) {
        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
    }

    public static void insertValuesIntoArray(int[] array, Scanner sc) {
        for (int i = 0; i < 5; i++) {
            array[i] = sc.nextInt();
        }
    }
}
