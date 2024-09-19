import java.util.*;

public class PrintSubarray {

    public static void subArray(int arr[]) {
        int totalSubArray = 0;
        int subArraySum = 0;
        int newarr[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    subArraySum += arr[k];
                    System.out.print(arr[k] + " ");
                }
                totalSubArray++;
                System.out.println();
            }
            newarr[i] = subArraySum;
            System.out.println("sum is : " + subArraySum);
            subArraySum = 0;
            System.out.println();
        }

        System.out.println("total sub arrays are : " + totalSubArray);
        System.out.println();

        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;

        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i] + ",");
            if (maxValue > newarr[i]) {
                maxValue = newarr[i];
            }

            if (minValue < newarr[i]) {
                minValue = newarr[i];
            }
        }
        System.out.println("the max sub is  " + maxValue);
        System.out.println("the min sub is  " + minValue);
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        subArray(arr);
    }
}