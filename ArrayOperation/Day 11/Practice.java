public class Practice {
    public static int getTrapedWater(int arr[]) {
        int n = arr.length;

        // calculate left max boundry
        int leftMax[] = new int[n];
        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i-1], arr[i]);
        }
    
        // calculate right max boundry
        int rightMax[] = new int[n];
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], arr[i]);
        }
        
        // waterLevel = min of left max bounry and right max bounry
        int TrapedRainWater= 0;
        for (int i = 0; i <n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // traped water = waterLevel - barheight
            TrapedRainWater += waterLevel - arr[i];
        }
        return TrapedRainWater;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(getTrapedWater(arr));
    }
}
