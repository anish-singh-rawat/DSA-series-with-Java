public class HelloRectangle {
    public static void halfButterFly(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.err.print("*");
            }
            for (int j = 1; j <= 2 * (num - i); j++) {
                System.err.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.err.print("*");
            }
            System.err.println();
        }

        for (int i = num; i >= 1; i--) {
            for (int j =1; j <=i; j++) {
                System.err.print("*");
            }
            for (int j = 1; j <=2*(num-i) ; j++) {
                System.err.print(" ");
            }
            for (int j =1; j <=i; j++) {
                System.err.print("*");
            }
            System.err.println();
        }
    }

    public static void main(String[] args) {
        halfButterFly(6);
    }
}