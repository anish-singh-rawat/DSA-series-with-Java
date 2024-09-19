import java.util.*;

public class linearSearch { 
    public static int linearSearchData(String arr[], String key) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int getLargest(int num[]){
        int largestNum = Integer.MIN_VALUE; // - infinity
        for (int i = 0; i < num.length; i++) {
            if (num[i] >largestNum) {
                largestNum = num[i];
            }
        }
        return largestNum;
    }

    public static int getSmallest(int num[]){
        int largestNum = Integer.MAX_VALUE; // infinity
        for (int i = 0; i < num.length; i++) {
            if (num[i] <largestNum) {
                largestNum = num[i];
            }
        }
        return largestNum;
    }


    public static void main(String[] args) {
        int array [] = {1,2,3,4,5,6};
        String menuItem[] = {"paneer tikka", "dal makhani", "chole bhature"};
        System.out.println( linearSearchData(menuItem, "dal makhani"));
        System.out.println(getLargest(array));
        System.out.println(getSmallest(array));
    }
}
