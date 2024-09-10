import java.util.*;

public class Loop {

    // public static void NormalStarPrint() {
    //    // 1 to 5 line start print;  
    //   int line = 5;
    //   for (int i = 0; i < line; i++) {
    //     for (int j = 0; j <=i ; j++) {
    //         System.out.print('*');
    //     }
    //     System.out.println();
    //   }
    // }

    @SuppressWarnings("resource")
    public static void GetSomeOfTwoNumbers() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.err.println("the some of two numbers is : "+ sum);   
    }

    public static void main(String[] args) {

        // 1 to 5 line start print;
        // for (int i = 0; i <5; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // print 5 to 1 , (inverted) start pattern ;
        // for (int i = 5; i > 0; i--) {
        //     for (int j = 0; j < i; j++) {
        //         System.err.print('*');
        //     }
        //     System.out.println();
        // }


        // print Half pyramid pattern
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


        // print character pattern
        // char ch = 'A';
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }


        // NormalStarPrint();
        GetSomeOfTwoNumbers();
    }
}