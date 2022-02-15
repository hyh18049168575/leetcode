package leetcodeNumbers;
import java.lang.Math;

public class No121 {
    public static int maxProfit(int[] prices) {
        int max;
        int min = 0;
        int dis = 0;
        for (int a = 0; a < prices.length-1; a++){
            if (prices[a]<prices[min]){
                min = a;
            }
            max = a+1;
            dis = Math.max(dis, prices[max]-prices[min]);
        }
        return dis;
    }
    public static int maxProfit1(int[] prices) {
        int min = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 0;i<prices.length;i++){
            res = Math.max(res,prices[i]-min);
            min = Math.min(min,prices[i]);
        }
        return res;
    }
    public static int maxProfit2(int[] prices) {
        if (prices.length == 0)return 0;
        int[][] a = new int[prices.length][2];
        a[0][0] = 0;
        a[0][1] = -prices[0];
        for (int i = 0;i<prices.length;i++){
            a[i][0] = Math.max(a[i-1][0],a[i-1][1]+prices[i]);
            a[i][1] = Math.max(a[i-1][1],-prices[i]);
        }
        return a[prices.length-1][0];
    }
}
