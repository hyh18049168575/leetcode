package leetcodeNumbers;

public class No8 {
    public static int myAtoi(String s) {
        if (s.length() == 0){
            return 0;
        }
        char [] a = s.toCharArray();
        //用来标记是否为负数
        boolean flag = true;
        //res记录答案，last用来判断是否越界
        int res = 0, last = 0;
        //count用来记录遍历到哪一位
        int count = 0;
        //1、去掉前面的空格
        while (count<s.length()){
            if (a[count] == ' '){
                count++;
            }
            else break;
        }
        //2、查看是否有正负号
        if (count < s.length() && a[count] == '-'){
            count++;
            flag = false;
        }
        else if (count<s.length() && a[count] == '+'){
            count++;
        }
        //3、处理数字
        while (count<s.length()){
            //如果是数字，更新res
            if (a[count] >= '0' && a[count] <= '9'){
                last = res;
                res = res * 10 + (a[count] - '0');
                if (res/10 != last){
                    //当res / 10 != last，证明res越界了，根据正负号，返回最大或最小值
                    return flag? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                count++;
            }
            //如果不是数字，跳出循环
            else break;
        }
        //根据正负号返回结果
        return flag? res : -res;
    }
}
