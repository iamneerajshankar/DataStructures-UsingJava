package Arrays;
/*
* A java program to demonstrate Insertion sort. In Insertion sort, we pluck an element
* from the array and place it to its right place.

* Time Complexity of the insertion sort algorithm is O(n2) in the worst case and O(n)
* in the best case.
*
* It is a stable algorithm since it preserves the order of equal elements.
*
* It is not a recursive algorithm.
*
* Insertion sort is adaptive by default and no extra effort is needed to make it adaptive.
* The time complexity itself gets reduced from O(n2) to O(n) when the algorithm finds an
* array already sorted.
* */

import java.util.Scanner;

class InsertionSort{
    static void  printArray(int n, int[] arr){
        for(int i=0; i<n;i++){
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }

    static void sortArray(int n, int[] arr){
        int temp, j;
        //run for loop for number of passes
        for (int i=1; i<n; i++){
            temp = arr[i]; // store array at i in temp variable(as key)
            j = i-1;

            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j]; // move bigger element to right side
                j--;
            }
            arr[j+1] = temp; // finally, store the element at its right position in sorted array
        }

    }
}

public class InsertionSortAlgorithm {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int n = userIn.nextInt();

        int[] arr = new int[n]; // create an array of size n
        System.out.println("Enter the elements: ");
        for(int i=0;i<n; i++){
            arr[i] = userIn.nextInt();
        }

        //calling  InsertionSort class methods
        System.out.print(" The array before sorting: ");
        InsertionSort.printArray(n, arr);
        InsertionSort.sortArray(n, arr);
        System.out.print(" The array after sorting: ");
        InsertionSort.printArray(n, arr);

    }
}
