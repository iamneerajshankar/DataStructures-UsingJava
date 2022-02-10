package Arrays;
/*
* A Java program to show insertion of element in an already existing array
* An element can be inserted in an array at a specific position. For this operation to succeed,
* the array must have enough capacity.
 * */

import java.util.Scanner;

class InsertElement {
    //method to traverse and print array element
    public void printArray(int n, int[] arr) {

        for (int i=0; i<n; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }

    //method to show the insertion operation
    public void insertAtIndex(int n, int[] arr, int index, int element) {

        for (int i = n - 1; i>= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = element;

    }
}
public class ArrayInsertion {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int n = userIn.nextInt(); // takes user  defined size of array

        int[] arr = new int[100]; // create an array of size n
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = userIn.nextInt(); // prompts  user to enter the elements and store them
        }

        System.out.println("Please enter index where you want to add element: ");
        int index = userIn.nextInt();

        System.out.println("Please enter the element to be added:");
        int element = userIn.nextInt();

        //creating instance of InsertElement class and calling its methods
        InsertElement insertArray = new InsertElement();

        System.out.print("The array before insertion: ");
        insertArray.printArray(n, arr);
        insertArray.insertAtIndex(n, arr, index, element);
        n = n+1; // increase value of n so that newly added element is printed
        System.out.print("The array after the insertion: ");
        insertArray.printArray(n, arr);

     }
 }

