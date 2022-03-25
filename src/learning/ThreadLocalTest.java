package learning;

import java.util.*;

public class ThreadLocalTest {
    private List<String> messages = new ArrayList<>();

    public static final ThreadLocal<ThreadLocalTest> holder = ThreadLocal.withInitial(ThreadLocalTest::new);

    public static void add(String message) {
        holder.get().messages.add(message);
    }

    public static List<String> clear() {
        List<String> messages = holder.get().messages;
        holder.remove();

        System.out.println("size: " + holder.get().messages.size());
        return messages;
    }

    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("dj",1);
        hm.put("dj",2);
        hm.put("djh",3);
        for (Map.Entry<String,Integer> entry:hm.entrySet()) {
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
        System.out.println();
    }
}
