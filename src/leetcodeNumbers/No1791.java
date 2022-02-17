package leetcodeNumbers;

public class No1791 {
    public int findCenter(int[][] edges) {
        int a = edges[0][0] == edges[1][0]?edges[0][0]:edges[0][0]==edges[1][1]?edges[0][0]:edges[0][1];
        return a;
    }
}