import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {

    public static void main(String[] args) {
        String s = "a";
        String p = "a";
        System.out.println(findAnagrams(s,p));
    }
    
    static List<Integer> findAnagrams(String s, String p) {
        Map<Character, Integer> p_count = new HashMap<>();
        Map<Character, Integer> s_count = new HashMap<>();
        for(int y=0; y<p.length(); y++){
            if(!p_count.containsKey(p.charAt(y))){
                p_count.put(p.charAt(y), 1);
            }else{
                p_count.put(p.charAt(y), p_count.get(p.charAt(y))+1);
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int left=0, right =0; right<s.length(); right++){
            if (!s_count.containsKey(s.charAt(right))){
                s_count.put(s.charAt(right), 1);
            }else{
                s_count.put(s.charAt(right), s_count.get(s.charAt(right))+1);
            }
            if(right-left+1==p.length()){
                if(p_count.equals(s_count)) {
                    result.add(left);
                }
                s_count.put(s.charAt(left), s_count.get(s.charAt(left)) - 1);
                if(s_count.get(s.charAt(left))==0){
                    s_count.remove(s.charAt(left));
                }
                left += 1;
            }
        }return result;
    }
}
