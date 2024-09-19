public class ArrPairs {
    public static void ArrayPairs(int arr[]) {
        int countPair = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("("+ arr[i] + "," + arr[j] + ")");
                countPair++;
            }
            System.out.println();
        }
        System.out.println(countPair);
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        ArrayPairs(arr);
    }
}
