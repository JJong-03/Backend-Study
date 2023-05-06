import java.util.HashMap;

public class Maping {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("age", 30); // map.put(key, 값)
        map.put("mbti", "IMFP");

        System.out.println(map.get("age"));
        System.out.println(map.get("mbti"));
    }
}
