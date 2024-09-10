public class Factorial {
    public static int FactorialOfGivenNumber(int FactorialNum) {
        int result = 1;
        for (int i = 1; i <= FactorialNum; i++) {
            result *= i;
        }
        return result;
    }

    public static int RecursionFactorial(int FactorialNumber) {
        if (FactorialNumber <= 1) {  
            return 1;
        } else {
            return FactorialNumber * RecursionFactorial(FactorialNumber - 1); 
        }
    }
    
    public static void main(String[] args) {
        int number = 5; 
        int result = RecursionFactorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
    
}
