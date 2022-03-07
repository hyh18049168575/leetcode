import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        int[] dp = new int[n]; // [0.i]的最大子序列和
        dp[0] = Math.max(arr[0], 0);
        int pre = arr[0];
        for (int i = 1; i < n; ++i) {
            pre = Math.max(arr[i], pre + arr[i]);
            dp[i] = Math.max(dp[i - 1], pre);
        }
        int[] dpReverse = new int[n];
        dpReverse[n - 1] = Math.max(arr[n - 1], 0);
        pre = arr[n - 1];
        for (int i = n - 2; i >= 0; --i) {
            pre = Math.max(arr[i], pre + arr[i]);
            dpReverse[i] = Math.max(dpReverse[i + 1], pre);
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; ++i) {
            max = Math.max(dp[i] + (i < n - 1 ? dpReverse[i + 1] : 0), max);
        }
        System.out.println(max);
    }
}
