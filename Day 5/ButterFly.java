public class ButterFly {
    public static void ButterFlyCode(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j >= j - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ButterFlyCode(4);
    }
}
