public class Pattern {
    // ****
    // *  *
    // *  *
    // ****
    public static void HollowRec(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if(i==j){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HollowRec(5);
    }
}
