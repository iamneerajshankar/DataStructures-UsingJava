package Arrays;
/*
* A Java program to demonstrate quick sort algorithm.
* */
class QuickSortLogic{
    void printArray(int n, int[] arr){
        for(int i=0;i<n;i++){
            System.out.print(" " +arr[i]);
        }
        System.out.println();
    }

    int partition(int low, int high, int[] arr){
        int pivot = arr[low];
        int i = low +1;
        int j = high;
        int temp;
        do{
            // loops till find element greater than or equal to element at pivot
            while(arr[i]<=pivot){
                i++;
            }
            // loops till find element smaller that element at pivot
            while(arr[j]>pivot){
                j--;
            }
            if(i<j){
                //swaps the element at i and j
                temp = arr[j];
                arr[j]=arr[i];
                arr[i]= temp;
            }
        }while(i<j);
        // swaps the element arr[low] and arr[j] when i and j cross each other
            temp = arr[low];
            arr[low] = arr[j];
            arr[j] = temp;
            return j;
    }

    void quickSort(int low, int high, int[] arr){
        int partitionIndex;
        if(low<high){
            partitionIndex = partition(low, high, arr); // gives the index of next partitioning
            quickSort(low, partitionIndex-1, arr); // to sort the left sub array
            quickSort(partitionIndex +1, high, arr); // to sort right sub array
        }

    }
}


public class QuickSortAlgorithm {
    public static void main(String[] args) {
        int arr[] = new int[]{3, 5, 2, 13, 12, 3, 2, 13, 45};
        int n = arr.length;

        QuickSortLogic quickSortLogic = new QuickSortLogic(); //created object of the QuickSortLogic class
        System.out.print("The given array is: ");
        quickSortLogic.printArray(n,arr);
        quickSortLogic.quickSort(0,n-1,arr);
        System.out.print("The sorted array is: ");
        quickSortLogic.printArray(n,arr);

    }
}
