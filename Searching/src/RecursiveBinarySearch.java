public class RecursiveBinarySearch {
    public static int recursiveBinarySearching(int arr[],int low ,int high,int x){
        int mid=low+(high-low)/2;
         while(low<=high){
             if(arr[mid]==x){
                 return mid;
             }
             else if(arr[mid]>x){
                 return recursiveBinarySearching(arr,low,mid-1,x);
             }
             else{
                 return recursiveBinarySearching(arr,mid+1,high,x);
             }
         }
         return -1;
    }

    public static void main(String[] args) {
int[]arr={23,45,47,59,233,455};
int low=0;
int high= arr.length-1;
int x=455;
        System.out.println(recursiveBinarySearching(arr,low, high,x));
    }
}
