package leetcodeNumbers;

public class No204 {
    public int countPrimes(int n) {
        int cnt = 0;

        if (n < 2){
            return 0;
        }
        boolean[] flag = new boolean[n];
        for (int i = 2;i<n;i++){
            if (flag[i])continue;
            cnt++;
            for (int j = i;j<n;j += i){
                flag[j] = true;
            }
        }

        return cnt;
    }
}
