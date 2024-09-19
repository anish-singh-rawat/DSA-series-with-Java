public class BinnarySearch {
    public static int BinnarySearchMethod(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) { // left side search
                end = mid - 1;
            } else {  // right side search
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void BinnaryArrReverse(int arr[]) {
        int start = 0, end = arr.length-1;
        while (start<end) {
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end] = temp;  
            
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 11, 22, 33, 44, 55 };
        // int key = 2;
        // System.out.println(BinnarySearchMethod(arr, key));
        BinnaryArrReverse(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.err.println();
    }
}