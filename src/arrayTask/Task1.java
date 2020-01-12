package arrayTask;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = new int[10];
        printArrayElements(array);
        insertValueIntoArray(array);
        printArrayElements(array);
        int count = sumOfArrayElements(array);
        System.out.println("Sum Of Elements ="+count);
        double average = getAverage(count);
        System.out.println("Average Of Array Elements"+average);
    }

    public static double getAverage(double count) {
        return count /10;
    }


    public static int sumOfArrayElements(int[] array) {
        int count=0;
        for(int i=0;i<10;i++){
            count=count+array[i];
        }
        return count;
    }

    public static void insertValueIntoArray(int[] array) {
        for(int i=0 ; i<10 ; i++){
            array[i]=sc.nextInt();
        }
    }

    /**
     * the method printArrayElements prints the all the elements of array
     * Array.toString method is used to return a string representation of the contents of the specified int array.
     * integer[] is the array
     * */

    public static void printArrayElements(int[] integer) {
        System.out.println(Arrays.toString(integer));
    }
}
