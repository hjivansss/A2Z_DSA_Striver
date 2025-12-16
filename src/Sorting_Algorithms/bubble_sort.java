package Sorting_Algorithms;
import java.util.*;
public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1,0};
        bubblesort(arr);
        printArray(arr);
    }

    static void bubblesort(int[] arr){

        int n=arr.length;
        for(int i = 0 ;i<n;i++){
            int didSwap=0;
            for(int j =0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    didSwap=1;
                    swap(arr,j,j+1);
                }
            }
            if (didSwap==0){
                break;
            }
        }
    }

    static void swap(int[] arr, int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]= temp;
    }

    static void printArray(int[] arr){
        for(int i : arr ){
            System.out.println(i);
        }
    }
}

/*Time Complexity :
                  Worst case =O(n^2)=>When sorted in reverse order
                  Best Case = O(n) => already sorted
  Space Complexity : O(1)
                  */