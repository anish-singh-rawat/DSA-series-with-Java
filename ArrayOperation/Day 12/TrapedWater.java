public class TrapedWater {
    public static int getTrapedWater(int data[]) {

        // calculate Left max boundry
        int n = data.length;
        int leftMaxBounry[] = new int[n];
        leftMaxBounry[0] = data[0];
        for (int i = 1; i < n; i++) {
            leftMaxBounry[i] = Math.max(leftMaxBounry[i - 1], data[i]);
        }

        // calculate Right max boundry
        int rightMaxBoundry[] = new int[n];
        rightMaxBoundry[n - 1] = data[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMaxBoundry[i] = Math.max(rightMaxBoundry[i + 1], data[i]);
        }

        int TrapedWater = 0;
        for (int i = 0; i < n; i++) {
            // waterLevel = min of left max bounry and right max bounry
            int waterLevel = Math.min(rightMaxBoundry[i], leftMaxBounry[i]);

            // traped water = waterLevel - barheight
            TrapedWater += waterLevel - data[i];
        }
        return TrapedWater;
    }

    public static void main(String[] args) {
        int data[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(getTrapedWater(data));
    }
}
