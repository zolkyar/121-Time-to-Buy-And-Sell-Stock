class Solution {
    fun maxProfit(prices: IntArray): Int {
        if (prices.size == 0 || prices.size > 100000) {return 0}
        
        var Min: Int = prices[0]
        var Max: Int = prices[0]
        var profit: Int = 0
        
        for (i in prices.indices) {
            if (prices[i] > Max) {
                Max = prices[i]
                if (Max-Min > profit) {
                    profit = Max - Min
                }
            }
            
            else if (prices[i] < Min) { 
                Min = prices[i]
                Max = prices[i]
            }        
        }
        
        
        return profit
    }
}