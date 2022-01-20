package leetcodeNumbers;

public class No278 {
    boolean isBadVersion(int version){
        return false;
    }
    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start < end){
            int mid = start/2 +end/2;
            if (isBadVersion(mid))
                end = mid;
            else {
                start = mid+1;
            }
        }
        return start;
    }
}
