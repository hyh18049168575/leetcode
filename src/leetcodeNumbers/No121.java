package leetcodeNumbers;
import java.lang.Math;

public class No121 {
    public static int maxProfit(int[] prices) {
        int max = 0;
        int min = 0;
        int dis = 0;
        for (int a = 0; a < prices.length-1; a++){
            if (prices[a]<prices[min]){
                min = a;
            }
            if (prices[a]>prices[max] || max > min){
                max = a;
            }
            dis = Math.max(dis, prices[max]-prices[min]);
        }
        return dis;
    }
}
