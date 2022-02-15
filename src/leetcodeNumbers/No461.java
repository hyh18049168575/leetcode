package leetcodeNumbers;

public class No461 {
    public int hammingDistance(int x, int y) {
        int a = x^y;
        int cnt = 0;
        while(a != 0){
            a = a&(a-1);
            cnt++;
        }
        return cnt;
    }
}
