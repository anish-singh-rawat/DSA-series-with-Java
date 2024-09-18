public class Diamond {
    public static void PrintDiamond(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = num; j >i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i*2)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = num; i >=1; i--) {
            for (int j = num; j >i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i*2)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrintDiamond(5);
    }
}
