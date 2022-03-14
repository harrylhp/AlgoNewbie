package LeetCode;

public class BuyAndSellStock {
    public static void main(String []args){
        System.out.println("Max profit is : " + maxProfitBruteForce(new int[]{7,1,5,3,6,4}));
        System.out.println("Max profit is : " + maxProfit(new int[]{7,1,5,3,6,4}));
    }

    //Brute force
    public static int maxProfitBruteForce(int [] prices){
        int slow = 0, fast = 1;
        int maxProfit = 0;

        for (slow = 0; slow < prices.length; slow++){
            while(fast < prices.length) {
                maxProfit = Math.max(maxProfit, prices[fast] - prices[slow]);
                fast++;
            }
            fast = slow + 1;
            //System.out.println("Fast is :  " + fast + " Max Profit is :  " + maxProfit);
        }
        return maxProfit;
    }

    public static int maxProfit(int [] prices) {
        if (prices == null || prices.length == 1)
            return 0;

        int maxProfit = 0, min = prices[0];

        for (int i = 0; i < prices.length; i++) {
            //System.out.println("Max is : " + maxProfit + " Min is : " + min);
            min = Math.min(min, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - min);
        }
        return maxProfit;
    }
}
