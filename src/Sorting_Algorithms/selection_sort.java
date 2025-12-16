package Sorting_Algorithms;

public class selection_sort {
    public static void main(String[] args) {
        // Select the range of unsorted array and then find the minimum index of element and swap with first element
        int[] arr={4,3,2,1,0};
        selectionSort(arr);
        printArray(arr);
    }

    static void selectionSort(int[] arr){

        int n = arr.length;
        for(int i = 0 ;i<n;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            swap(arr,minIndex,i);
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