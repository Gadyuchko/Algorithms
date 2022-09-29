import java.util.HashMap;
import java.util.Map;

/*
You are given a string s and an integer k.
You can choose any character of the string and change it to any other uppercase English character.
You can perform this operation at most k times.

Return the length of the longest substring containing the same letter you can get after
performing the above operations.
 */

public class LongestRepeatingCharacter {
    public static void main(String[] args) {
        String a ="AABABBA";
        System.out.println(characterReplacement(a, 1));
    }
    static int characterReplacement(String s, int k) {
        Map<Character,Integer> map = new HashMap<>();
        int count =0;
        for (int left=0, right = 0; right<s.length(); right++){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            int freq = freq(map);
            if((right-left+1)-freq <= k){
                count=right-left+1;
            }else{
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }
        }
        return count;
    }
    static int freq(Map<Character, Integer> map){
        int r =0;
        for(Map.Entry e:map.entrySet()){
            if((int)e.getValue()>r) {
                r=(int)e.getValue();
            }
        }return r;
    }
}
