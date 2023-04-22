public class BubbleSort {
    static void swap(int[] arr,int val1,int val2){
        int tp=arr[val1];
        arr[val1]=arr[val2];
        arr[val2]=tp;
    }
    public static void main(String[] args) {

        int[] arr = {65,25,12,22,11};
        int n=arr.length;

        //In bubble sort we compare the value  with its neighbour if value is greater than swap otherwise ignore
        /*
        * In Bubble sort , largest element get placed in every iteration ex: In our first round last element
        * get placed to its original sorted location.
        *
        *    Time Complexity =  O(n^2)
        *    Space Complexity= O(1)
        */
        for(int i=1;i<n;i++){
            //For rounds 1 to n-1
            boolean flag=false;
            for(int j=0;j<n-i;j++){
                if(arr[j]>arr[j+1]){//comparing the values
                    flag=true;
                    swap(arr,j,j+1);
                }
            }
            if(!flag){
                break;
            }
        }
        for (int j : arr) {
            System.out.print(j+" ");
        }

    }
}
