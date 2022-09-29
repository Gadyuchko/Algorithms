/*
You are playing the Bulls and Cows game with your friend.

You write down a secret number and ask your friend to guess what the number is.
When your friend makes a guess, you provide a hint with the following info:

The number of "bulls", which are digits in the guess that are in the correct position.
The number of "cows", which are digits in the guess that are in your secret number but are located in the wrong position. Specifically,
the non-bull digits in the guess that could be rearranged such that they become bulls.
Given the secret number secret and your friend's guess guess, return the hint for your friend's guess.

The hint should be formatted as "xAyB", where x is the number of bulls and y is the number of cows. Note that both secret and guess may contain duplicate digits.
 */

import java.util.HashMap;
import java.util.Map;

public class BullsAndCows {
    public static void main(String[] args) {
        String s = "1122";
        String g = "2211";
        String s2 = "1807";
        String g2 = "7810";
        String s3 = "1123";
        String g3 = "0111";
        String s4 = "1122";
        String g4 = "1222";
        System.out.println(getHint(s3,g3));
    }

    static String getHint(String secret, String guess) {
        int b_count = 0;
        int c_count = 0;
        Map<Character, Integer> s_map = new HashMap<>();
        for(int y=0; y< secret.length(); y++){
            if(secret.charAt(y)==guess.charAt(y)){
                b_count++;
            }else{
                s_map.put(secret.charAt(y), s_map.getOrDefault(secret.charAt(y),0)+1);
            }
        }
        for(int i=0; i<guess.length(); i++){
            if(s_map.containsKey(guess.charAt(i))){
                if(secret.charAt(i)==guess.charAt(i)){
                    continue;
                }
                if(s_map.containsKey(guess.charAt(i)) && s_map.get(guess.charAt(i))>0){
                    c_count++;
                    s_map.put(guess.charAt(i), s_map.get(guess.charAt(i))-1);
                }
            }
        }
        return (b_count+"A"+c_count+"B");
    }
}
