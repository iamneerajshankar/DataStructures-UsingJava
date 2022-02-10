package Arrays;

import java.util.Scanner;

/*
* A java program to demonstrate basic understanding of array.
* array is a collection of items stored at contiguous memory locations. The idea
* is to store multiple items of the same type together.
* */
class ExploringArray{

    //method to traverse and print array element
    public void printArray(int n, int[] arr){

        for (int i=0; i<n; i++){
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }

}
public class UnderstandingTheArray {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int n = userIn.nextInt(); // takes user  defined size of array

        int[] arr = new int[n]; // create an array of size n
        System.out.println("Enter the elements: ");
        for(int i=0;i<n; i++){
            arr[i] = userIn.nextInt(); // prompts  user to enter the elements and store them
        }

        //creating instance of ExploringArray class and calling its methods
        ExploringArray exploringArray = new ExploringArray();
        System.out.print(" The array elements: ");
        exploringArray.printArray(n, arr);

    }
}
