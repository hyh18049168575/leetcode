import java.util.HashMap;

public class No290 {
    public static boolean findPattern(String a, String b){
        HashMap<Character, String> map = new HashMap<>();
        String[] dog = b.split(" ");
        if (a.length()!=dog.length){
            return false;
        }
        for(int i=0;i<a.length();i++){
            char key=a.charAt(i);
            if (map.containsKey(key)){
                if(!map.get(key).equals(dog[i])){
                    return false;
                }
            }
            else {
                if(map.containsValue(dog[i])){
                    return false;
                }

                map.put(key,dog[i]);
            }
        }
        return true;
    }
}
