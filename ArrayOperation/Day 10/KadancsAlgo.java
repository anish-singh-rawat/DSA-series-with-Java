public class KadancsAlgo {
    public static void KadancsLow(int num[]) {
        int minSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < num.length; i++) {
            currentSum += num[i];
            if(currentSum<0){
                currentSum =0;
            }
            minSum = Math.max(currentSum, minSum);
        }
        System.out.println("max array sum is "+ minSum);
    }
    public static void main(String[] args) {
        int arr[] = {-1,2};
        KadancsLow(arr);
    }
}
