public class QuickSort {

    /*
    * In merge sort , we find the partition index(left values are smaller than partition index value and right one are greater)
    * and during finding the partition index we arrange the value into their above operation, basically it's a divide
    * and conquer algorithm.
    *
    *    Time Complexity =  O(nlogn)
    *    Space Complexity= O(1)
    */
    public static void main(String[] args) {
        int[] arr={23,2,21,1,0,3,4};

        int start=0;
        int end=arr.length-1;

        sort(arr,start,end);
        for(int i=0;i<end;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void sort(int[] arr, int start ,int end){
        if(start>=end){
            return;
        }

        int partitionIdx=findPartition(arr,start,end);

        sort(arr,start,partitionIdx-1);
        sort(arr,partitionIdx+1,end);

    }
    static int findPartition(int[] arr,int start ,int end){
        int pivotVal=arr[end];
        int index=start;

        for(int i=start;i<=end;i++){
            if(arr[i]<pivotVal){
                swap(arr,i,index);
                index++;
            }
        }
        swap(arr,index,end);
        return index;
    }
    static void swap(int[] arr,int val1,int val2){
        int tp=arr[val1];
        arr[val1]=arr[val2];
        arr[val2]=tp;
    }
}
