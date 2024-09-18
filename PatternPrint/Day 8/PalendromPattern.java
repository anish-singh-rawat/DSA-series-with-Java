public class PalendromPattern {
    public static void printPallendrom(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i; j > 1; j--) {
                System.out.print(j-1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPallendrom(7);
    }
}