public class LinearSearch {
    public static int linearSearching(int[]arr,int x){
         for(int i=0;i<arr.length;i++){
              if(arr[i]==x){
                  return i;
              }
         }
         return -1;
    }

    public static void main(String[] args) {
int[] arr={23,12,34,24,122,231,678,345};
int x=678;
        System.out.println(linearSearching(arr,x));
    }
}

