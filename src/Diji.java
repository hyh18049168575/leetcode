import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Diji {
    private String value;

    public Diji() {
        value = "JavaGuide";
    }

    public void publicMethod(String s) {
        System.out.println("I love " + s);
    }

    private void privateMethod() {
        System.out.println("value is " + value);
    }

    public int dijjj(String s){
        System.out.println(s);
        return 1;
    }
}

