class Solution {
    fun maxProfit(prices: IntArray): Int {
        if (prices.size == 0 || prices.size > 100000) {return 0}
        
        var min: Int = prices[0]
        var max: Int = prices[0]
        var profit: Int = 0
        
        for (i in prices) {
            if (i > max) {
                max = i
                profit = maxOf(profit, max - min)
            }
            
            else if (i < min) { 
                min = i
                max = i
            }        }
        
        
        return profit
    }
}