package Offer2;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class No35 {
    public int findMinDifference(List<String> timePoints) {
        Collections.sort(timePoints);
        int ans = Integer.MAX_VALUE;
        for (int i = 1;i < timePoints.size();i++){
            int minutes = (((timePoints.get(i).charAt(0)-'0')*10+(timePoints.get(i).charAt(1)-'0'))*60+(timePoints.get(i).charAt(3)-'0')*10+(timePoints.get(i).charAt(4)-'0'))
                    -(((timePoints.get(i-1).charAt(0)-'0')*10+(timePoints.get(i-1).charAt(1)-'0'))*60+(timePoints.get(i-1).charAt(3)-'0')*10+(timePoints.get(i-1).charAt(4)-'0'));
            ans = Math.min(minutes,ans);
        }
        int minutes =(((timePoints.get(0).charAt(0)-'0')*10+(timePoints.get(0).charAt(1)-'0'))*60+(timePoints.get(0).charAt(3)-'0')*10+(timePoints.get(0).charAt(4)-'0')+24*60)
                -(((timePoints.get(timePoints.size()-1).charAt(0)-'0')*10+(timePoints.get(timePoints.size()-1).charAt(1)-'0'))*60+(timePoints.get(timePoints.size()-1).charAt(3)-'0')*10+(timePoints.get(timePoints.size()-1).charAt(4)-'0'));
        ans = Math.min(minutes,ans);
        return ans;
    }
}
