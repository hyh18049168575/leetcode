package leetcodeNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No830 {
    public static List<List<Integer>> solution(String s){
        char dj[] = s.toCharArray();
        List<List<Integer>> hz = new ArrayList<List<Integer>>();
        if (s.length()==0){
            return hz;
        }
        for (int a=0,b=1;a<s.length()-1;){
            while(dj[a]==dj[b]){
                b++;
                if (b==s.length()){
                    break;
                }
            }
            if (b-a>2){
                hz.add(Arrays.asList(a,b-1));
            }
            a=b;b++;
        }
        return hz;
    }
}
