public class SolidRombus {
    public static void ROmbus(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num-i; j++) {
                System.err.print(" ");
            }
            for (int j = 1; j <= num; j++) {
                System.err.print("*");
            }
            System.err.println();
        }
    }
    public static void main(String[] args) {
        ROmbus(5);
    }
}
