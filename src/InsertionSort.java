public class InsertionSort {

    public static void main(String[] args) {

        int[] arr={10,1,7,4,8,2,4};
        int n=arr.length;
        /*
        *  In Insertion sort,we take element and compare that element to its previous placed element , if the
        *  current element is smaller than the previous element then we shift the previous element by one in right direction
        *  until the specific condition became false and placed the current element.
        *
        *    Time Complexity =  O(n^2)
        *    Space Complexity= O(1)
        */

        for(int i=1;i<n;i++){
            int tp=arr[i];
            int j=i-1;
            while(j>=0){
                if(arr[j]>tp){
                    arr[j+1]=arr[j];
                }else{
                    break;
                }
                j--;
            }
            arr[j+1]=tp;
        }

        for (int j : arr) {
            System.out.println(j);
        }
    }
}
