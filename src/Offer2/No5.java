package Offer2;

public class No5 {
    public int maxProduct(String[] words) {
        int res = 0;
        for (int i = 0;i<words.length;i++){
            String word = words[i];
            for (int j = i+1;j<words.length;j++){
                if (!isSame(word,words[j])){
                    res = Math.max(res,word.length()*words[j].length());
                }
            }
        }
        return res;
    }
    private boolean isSame(String s1,String s2){
        for (char c : s1.toCharArray()){
            if (s2.indexOf(c) != -1){
                return true;
            }
        }
        return false;
    }

    public int maxProduct2(String[] words) {
        int[] binary = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            for (int j = words[i].length() - 1; j >= 0; j--) {
                binary[i] |= 1 << words[i].charAt(j) - 'a';
            }
        }

        int maxProduct = 0;

        for (int i = 1; i < words.length; i++) {
            for (int j = 0; j < i; j++) {
                if ((binary[i] & binary[j]) == 0) {
                    maxProduct = Math.max(maxProduct, words[i].length() * words[j].length());
                }
            }
        }

        return maxProduct;
    }
}
