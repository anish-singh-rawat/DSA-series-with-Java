public class TrapedRainWater {
    public static int PrintTrapedRainWater(int arr[]) {
        int length = arr.length;

        // calculate left max boundry array
        int leftMaxBoundry[] = new int[length];
        leftMaxBoundry[0] = arr[0];
        for (int i = 1; i < length; i++) {
            leftMaxBoundry[i] = Math.max(arr[i], leftMaxBoundry[i - 1]);
        }

        // calculate right max boundry array
        int rightMaxBoundry[] = new int[length];
        rightMaxBoundry[length - 1] = arr[length - 1];
        for (int i = length - 2; i >= 0; i--) {
            rightMaxBoundry[i] = Math.max(arr[i], rightMaxBoundry[i + 1]);
        }

        // calcuclate min of left and right max boudry = WaterLavel
        int TrapedRainWater = 0;
        for (int i = 0; i < length; i++) {
            int WaterLavel = Math.min(leftMaxBoundry[i], rightMaxBoundry[i]);
            TrapedRainWater += WaterLavel - arr[i];
        }

        return TrapedRainWater;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(PrintTrapedRainWater(arr));
    }
}