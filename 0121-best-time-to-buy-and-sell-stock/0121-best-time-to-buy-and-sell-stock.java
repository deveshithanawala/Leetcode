import java.util.Arrays;
import java.util.Collections;
class Solution{
  public int maxProfit(int[] prices){
      if(prices.length==1)
      {
          return 0;
      }
      int minProfit = prices[0];
      int maxProfit = 0;
      
      for(int i=1;i<prices.length;i++){
          if(prices[i]<minProfit)
          {
              minProfit= prices[i];
          }
          else
              maxProfit=Math.max(maxProfit,prices[i]-minProfit);
      }
      return maxProfit;
  }
}
      