import java.util.Arrays;

public class MyMain {
    // Sorting:
    // Implement the selection sort algorithm that we discussed in class
    // to sort our code
    // This algorithm returns the sorted array
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //find the index of the smallest value
            int minIndex=i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }

            }
            //swap the smallest value and the first spot
            int temp = arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        return arr;
    }


    // Implement the insertion sort algorithm that we discussed in class
    // to sort our code
    // This algorithm returns the sorted array
    public static int[] insertionSort(int[] arr) {
       
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Selection Sort Tests");
        System.out.println(Arrays.toString(selectionSort(new int[] {6, 1, 3, 8, 2, 9}))); // [1, 2, 3, 6, 8, 9]
        System.out.println(Arrays.toString(selectionSort(new int[] {12, 5, 23, 74, 15, 86, 2}))); // [2, 5, 12, 15, 23, 74, 86]

        System.out.println("Selection Sort Tests");
        System.out.println(Arrays.toString(selectionSort(new int[] {6, 1, 3, 8, 2, 9}))); // [1, 2, 3, 6, 8, 9]
        System.out.println(Arrays.toString(selectionSort(new int[] {12, 5, 23, 74, 15, 86, 2}))); // [2, 5, 12, 15, 23, 74, 86]
    }
}