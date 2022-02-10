package Arrays;
/*
* A java program to demonstrate the bubble sort algorithm - With bubble sort,
* we intend to ensure that the largest element of the segment reaches the last
* position at each iteration.

*Time Complexity of the bubble sort algorithm is O(n2).
*It is a stable algorithm, because it preserves the order of equal elements.
*It is not a recursive algorithm.
*Bubble sort is not adaptive by default, but can be made adaptive by modifying the program.
* */
import java.util.Scanner;

class BubbleSort{
    // method to print array elements
    static void printArray(int size, int[] arr){
        for(int i=0; i<size;i++){
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }
    // method to sort the array
    static void sortingArray( int size, int[] arr){

        int temp;
        int passes = 1;
        boolean isSorted = false; // we check if array is sorted

        for(int i=0; i<size; i++){
            //the inner loop for number of passes - n-1 passes
            for(int j=0; j<size-1-i; j++){
                    isSorted = true; // if array is already sorted
                    passes = passes + j;
                if(arr[j]>arr[j+1]) {
                    isSorted = false;
                    //whenever element at index j is greater than j+1, swap elements
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        if(isSorted){
            System.out.println("The number of passes taken: " + passes);
            for(int i=0; i<size; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
public class BubbleSortAlgorithm {

    public static void main(String[] args) {
        //create scanner object to take input from user the
        Scanner userIn = new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int n = userIn.nextInt();
        int[] arr = new int[n]; // creating an array for size n
        //ask user to give array elements
        System.out.println("Please enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = userIn.nextInt();
        }
        System.out.print(" The array before sorting: ");
        BubbleSort.printArray(n, arr);
        BubbleSort.sortingArray(n, arr);
        System.out.print(" The array after sorting: ");
        BubbleSort.printArray(n, arr);

    }
}
