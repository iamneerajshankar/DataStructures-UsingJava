package Arrays;
/*
 * In selection sort, at each pass, we make sure that the smallest element of the current
 * unsorted sub-array reaches its final position. And this is pursued by finding the smallest
 * element in the unsorted sub-array and replacing it at the end with the element at the first
 * index of the unsorted sub-array.
 *
 * The time complexity of the selection sort algorithm is O(n2) in all its cases.
 * It is not a stable algorithm since it fails to preserve the original order of equal elements.
 * We saw one example the other day.
 *
 * It is not a recursive algorithm.
 * Selection sort is not an adaptive algorithm. It anyway makes comparisons regardless of whether the
 * array given is sorted or not.

 * */

import java.util.Scanner;

class SelectionSort{
    static void  printArray(int n, int[] arr){
        for(int i=0; i<n;i++){
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }

    static void sortArray(int n, int[] arr){
        int IndexOfMin;
        int temp;
        for(int i=0;i<n-1; i++){
            IndexOfMin = i;

            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[IndexOfMin]){
                    IndexOfMin = j; // keep track of index of minimum element at each iteration
                }
            }
            //swap the element
            temp = arr[i];
            arr[i] = arr[IndexOfMin];
            arr[IndexOfMin] = temp;

        }
    }
}
public class SelectionSortAlgorithm {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int n = userIn.nextInt();

        int[] arr = new int[n]; // create an array of size n
        System.out.println("Enter the elements: ");
        for(int i=0;i<n; i++){
            arr[i] = userIn.nextInt();
        }

        //calling  SelectionSort class methods
        System.out.print(" The array before sorting: ");
        SelectionSort.printArray(n, arr);
        SelectionSort.sortArray(n, arr);
        System.out.print(" The array after sorting: ");
        SelectionSort.printArray(n, arr);
    }
}
