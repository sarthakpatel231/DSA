public class Selection {
    public static void selectionSort(int []arr){
int n=arr.length;
for(int i=0;i<n-1;i++){
    int minindex=i;
    for(int j=i+1;j<n;j++){
        if(arr[minindex]>arr[j]){
            // swap the element
            arr[minindex]=arr[minindex]^arr[j];
            arr[j]=arr[minindex]^arr[j];
            arr[minindex]=arr[minindex]^arr[j];

        }
    }
}
    }

    public static void main(String[] args) {
        int []arr={23,12,34,32,2,56,322,231,213};
        selectionSort(arr);
        for(int num:arr){
            System.out.println(num);
        }
    }
}
