public class BinarySearch {
    public static int getBinaryKey(int num[], int key) {
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (num[mid] == key) {
                return mid;
            } else if (num[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = {00, 11, 22, 33, 44, 55, 66, 77 };
        int key = 77;
        System.out.println(getBinaryKey(array, key));
    }
}
