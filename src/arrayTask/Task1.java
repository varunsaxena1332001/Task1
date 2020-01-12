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
        int sum = sumOfArrayElements(array);
        System.out.println("Sum Of Elements =" + sum);
        double average = getAverage(sum);
        System.out.println("Average Of Array Elements" + average);
    }

    /**
     * getAverage function will return the average of all elements of an array
     */

    public static double getAverage(double sum) {
        return sum / 10;
    }

    /**
     * sumOfArrayElements function will return sum of Array
     */

    public static int sumOfArrayElements(int[] array) {
        int sum=0;
        for(int i=0;i<10;i++){
            sum=sum+array[i];
        }
        return sum;
    }

    /**
     * insertValueIntoArray function is used to insert the values in the array
     * */

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
