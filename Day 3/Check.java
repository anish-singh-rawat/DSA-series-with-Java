public class Check {
    public static Boolean CheckPrime(int number) {
        for (int i = 2; i < number; i++) {
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void PrimeRange(int num){
        for (int i = 0; i < num; i++) {
            if(CheckPrime(i)){
                System.out.print(" "+ i);
            }
        }
    }
    public static void main(String[] args) {
     PrimeRange(9);
    }
}
