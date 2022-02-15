package Offer2;

public class No3 {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        for (int i = 0;i<n;i++){
            int j = i;
            int count = 0;
            while (j != 0){
                count++;
                j = j&(j-1);
            }
            res[i] = count;
        }
        return res;
    }
}
