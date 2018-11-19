package SortingAlgorithms;

import java.io.InputStream;
import java.util.Scanner;

public class InsertionSort {
    /*
    Create array with N random elements given by user, then sort N elements by insertion sort
     */
    public static void main(String[] args) {
        System.out.println("Enter N elements to be generated:" );
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array;
        array = new int[n];
        for (int i = 0; i<array.length; i++){
            array[i] = (int)(Math.random()*100);
            System.out.print(array[i] +", ");
        }
        for (int j = 2; j<array.length;j++){
            int key = array[j];
            int i = j -1;
            while(i>=0 && array[i]>key){
                array[i+1] = array[i];
                i = i - 1;
            }
            array[i+1] = key;
        }
        System.out.println("");
        for (int i = 0; i<array.length; i++){
            System.out.print(array[i] +", ");
        }
    }
}
