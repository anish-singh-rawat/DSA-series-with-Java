public class HolloRombus {
    public static void PrinthollowRombus(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = num; j >i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= num; j++) {
                if(i == 1 || i == num || j==1 || j==num){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrinthollowRombus(10);
    }
}