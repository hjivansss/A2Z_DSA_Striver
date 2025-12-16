package Sorting_Algorithms;

public class insertion_sort {
    public static void main(String[] args) {
        //have to assume first element as sorted and keep adding next element in a sorted way
        int[] arr = {4,3,2,1,0};
        insertionSort(arr);
        printArray(arr);
        }
    static void insertionSort(int[] arr){
        int n = arr.length;

    }

    static void printArray(int[] arr){
        for(int i : arr ){
            System.out.println(i);
        }
    }
    static void swap(int[] arr, int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]= temp;
    }
}