public class BuyAndSell {
    public static int CalculateBuyAndSell(int data[]) {
        int BuyPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;
        for (int i = 0; i < data.length; i++) {
            if(BuyPrice<data[i]){
                int todayProfit = data[i] -BuyPrice;
                MaxProfit = Math.max(todayProfit, MaxProfit);
            }else{
                BuyPrice = data[i];
            }
        }
        return MaxProfit;
    }

    public static void main(String[] args) {
        int data[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(CalculateBuyAndSell(data));
    }
}
