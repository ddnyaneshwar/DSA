package blind75;

public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        int[] arr= {8,6,5,2,1}; // {3, 2, 6, 5, 0, 3};-->output 4, {8,6,5,2,1}->0
        int profit=maxProfit(arr);
        System.out.println("Total profit: "+profit);
    }

    private static int maxProfit(int[] arr) {
        int buyPrice=arr[0];
        int maxProfit=0;

        for (int i = 1; i <arr.length; i++) {
            if(arr[i]<buyPrice){
                buyPrice=arr[i];
            }
            int currentSalePrice=arr[i];
            maxProfit=Math.max(maxProfit,currentSalePrice-buyPrice);
        }

        return maxProfit;
    }
}
