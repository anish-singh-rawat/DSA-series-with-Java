import java.util.*;

public class firstArray {
    public static void update(int array[], int nonChnagable) {
        nonChnagable = nonChnagable + nonChnagable;

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 1;
        }

    }

    public static void main(String[] args) {
        int MyFirstArray[] = new int[5]; // creating new array
        String fruits[] = { "Apple", "Mango" }; // creating array with strings

        Scanner sc = new Scanner(System.in);
        MyFirstArray[0] = sc.nextInt(); // taking input from user

        System.out.println("total persentage of the " + MyFirstArray[0] + " is " + MyFirstArray[0] / 1 + "%");

        int MyFirstArray2[] = { 100, 200, 300, 400 };
        int nonChnagable = 10;

        update(MyFirstArray2, nonChnagable);
        for (int i = 0; i < MyFirstArray2.length; i++) {
            System.out.println(MyFirstArray2[i]);
        }
        System.err.println(nonChnagable);
    }
}