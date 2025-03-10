//Time Complexity - O(n)
//Space Complexity - O(1)
class BuyAndSellStock2 {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0){
            return 0;
        }
        int l =0, r=0;
        int profit =0;
        int n = prices.length;
        while(l<n && r<n){
            if(prices[l] > prices[r]){
                l=r;
                r=l;
            } else if(r == n-1 || prices[r] > prices[r+1]){
                profit = profit + prices[r] - prices[l];
                l=r+1;
                r=l;
            } else {
                r++;
            }
        }
        return profit;
    }
}
