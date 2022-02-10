package Arrays;

/*
* A java program for deletion of an element from an arr
* An element at a specified position can be deleted, creating a void that needs
* to be fixed by shifting all the elements to their adjacent left
* */
class DeleteElement{
    //method to traverse and print array element
    public void printArray(int n, int[] arr) {

        for (int i=0; i<n; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }
    public void deleteFromIndex(int n, int[] arr, int index){
        for(int i=index; i<n-1; i++){
            arr[i] = arr[i+1];
        }
    }
}
public class ArrayDeletion {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        int index = 5;

        //creating instance of InsertElement class and calling its methods
        DeleteElement deleteItem = new DeleteElement();

        System.out.print("The array before deletion: ");
        deleteItem.printArray(n, arr);
        deleteItem.deleteFromIndex(n, arr, index);
        n = n-1; // decrease value of n so that place removed element is adjusted
        System.out.print("The array after the insertion: ");
        deleteItem.printArray(n, arr);

    }
}
