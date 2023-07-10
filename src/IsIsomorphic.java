import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class IsIsomorphic {

    static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> g = new LinkedHashMap<>();
        g.put(s.charAt(0),t.charAt(0));
        boolean is = true;
        for (int i=1; i<s.length(); i++){
            if(g.containsKey(s.charAt(i))){
                if(!g.get(s.charAt(i)).equals(t.charAt(i))){
                    is=false;
                    break;
                }
            }
            if(g.containsValue(t.charAt(i)) && !Objects.equals(getKey(g, t.charAt(i)), s.charAt(i))){
                is=false;
                break;
            }
            g.put(s.charAt(i), t.charAt(i));
        }return is;
    }

    private static  <K, V> K getKey(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null;
    }

}
