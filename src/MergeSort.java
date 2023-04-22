public class MergeSort {

    /*
    * In merge sort , we divide the array from mid-index value(virtually) till we get single element using recursion
    * and during the return we merge the array into their sorted order.
    *
    *   Time Complexity =  O(nlogn)
    *   Space Complexity= O(n)
    */
    public static void main(String[] args) {
        int[] arr={6,1,5,3,2,4};

        int start=0;
        int end=arr.length-1;

        sort(arr,start,end);
        for(int i=0;i<=end;i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void sort(int[] arr,int start,int end){

        if(start==end){
            return;
        }
        int mid=(start+end)/2;

        sort(arr,start,mid);
        sort(arr,mid+1,end);

        merge(arr,start,mid,end);
    }
    static void merge(int[] arr, int start,int mid,int end){
        int len1=mid-start+1;
        int len2=end-mid;

        int[] temp1=new int[len1];
        int[] temp2=new int[len2];

        int index=0;

        for(int i=start;i<=mid;i++){
            temp1[index++]=arr[i];
        }

        index=0;
        for(int j=mid+1;j<=end;j++){
            temp2[index++]=arr[j];
        }

        int index1=0;
        int index2=0;

        int ansIndex=start;

        while(index1<len1 && index2<len2){ //Util there are values in both array

            if(temp1[index1]<temp2[index2]){
                arr[ansIndex] = temp1[index1];
                index1++;
            }else{
                arr[ansIndex] = temp2[index2];
                index2++;
            }
            ansIndex++;
        } //This while loop will run until there are element of the arrays


        //Copying the elements of the reaming array into my ansArray



        while(index1<len1){
            arr[ansIndex++] = temp1[index1++];
        }

        while(index2<len2){
            arr[ansIndex++] = temp2[index2++];
        }

        return;

    }
}
