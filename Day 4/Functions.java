public class Functions {

    public static void HelowRec(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i == 1 || i == num || j == 1 || j == num) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void InvertedRow(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = num; j >= 0; j--) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void InvertedHalfPyramid(int num) {
        for (int i = num; i > 0; i--) {
            for (int j = 0; j < num; j++) {
                if (i > j) {
                    System.out.print(j + 1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void OptimizeInvertedHalfPyramid(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void FloyedTrangle(int num) {
        int number = 0;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i >= j) {
                    number = number + 1;
                    System.err.print(number + " ");
                }
            }
            System.err.println();
        }
    }

    public static void BinarryTrangle(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i >= j) {
                    if ((i + j) % 2 == 0) {
                        System.err.print("1 ");
                    } else {
                        System.err.print("0 ");
                    }
                }
            }
            System.err.println();
        }
    }

    public static void ButterFly(int num) {
        // Upper part of the butterfly
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * (num - i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    
        // Lower part of the butterfly
        for (int i = num; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * (num - i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    

    public static void main(String[] args) {
        ButterFly(5);
    }
}