package leetcodeNumbers;

public class No191 {
    public int hammingWeight(int n) {
        int cnt = 0;
        for (int i = 0; i < 32;i++){
            if (((n>>>1)&1) == 1){
                cnt++;
            }
        }
        return cnt;
    }
}
