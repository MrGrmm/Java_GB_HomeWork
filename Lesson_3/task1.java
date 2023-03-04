package Lesson_3;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        int[] array = { 4, 1, 7, 3, 8, 5, 9, 2, 6 };
        System.out.println("Unsorted array: " + Arrays.toString(array));
        mergeSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void mergeSort(int[] array) {
        if (array.length > 1) {
            int mid = array.length / 2;
            int[] leftArray = Arrays.copyOfRange(array, 0, mid);
            int[] rightArray = Arrays.copyOfRange(array, mid, array.length);

            mergeSort(leftArray);
            mergeSort(rightArray);

            int i = 0;
            int j = 0;
            int k = 0;

            while (i < leftArray.length && j < rightArray.length) {
                if (leftArray[i] < rightArray[j]) {
                    array[k] = leftArray[i];
                    i++;
                } else {
                    array[k] = rightArray[j];
                    j++;
                }
                k++;
            }

            while (i < leftArray.length) {
                array[k] = leftArray[i];
                i++;
                k++;
            }

            while (j < rightArray.length) {
                array[k] = rightArray[j];
                j++;
                k++;
            }
        }
    }
}