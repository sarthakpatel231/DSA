public class BinarySearch {
    public static int binarySearching(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
int[]arr={23,46,48,96,78,555};
int x=555;
        System.out.println(binarySearching(arr, x));
    }

}
