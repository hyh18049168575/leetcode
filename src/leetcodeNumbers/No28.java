package leetcodeNumbers;

public class No28 {
    public static int strStr(String haystack, String needle) {
        int a = -1;
        if (needle.length() == 0){
            return 0;
        }
        if (haystack.length() < needle.length()){
            return -1;
        }
        for (int i = 0;i<haystack.length()-needle.length()+1;i++){
            boolean b = false;
            if (haystack.charAt(i) != needle.charAt(0)){
                continue;
            }
            for (int j = 0; j<needle.length();j++){
                if (haystack.charAt(i+j) != needle.charAt(j)){
                    b = true;
                    break;
                }
            }
            if (b == false){
                return i;
            }
        }
        return a;
    }
}
