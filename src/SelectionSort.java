public class SelectionSort {


    public static void main(String[] args) {

        int[] arr= {65,25,12,22,11};
        int n=arr.length;
        /*
        * Selection sort --> In this multiple rounds run , and in every round we find the minimum value and
        * placed in th correct order.
        * It helps to find out kth minimum value.
        *
        *    Time Complexity =  O(n^2)
        *    Space Complexity= O(1)
        */

        for(int i=0;i<n-1;i++){
            int minIdx=i;
            for(int j=i+1;j<n;j++) {
                if (arr[minIdx] > arr[j]){
                    minIdx = j;
                }
            }
            int tp=arr[i];
            arr[i]=arr[minIdx];
            arr[minIdx]=tp;
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
