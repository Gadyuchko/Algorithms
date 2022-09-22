import java.util.ArrayList;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "duikjuu";
        System.out.println(longestPossiblePalindrome(s));
    }
//    static int begin = 0;
    static int length = 0;
    static int longestPalindrome(String s) {

        if(s.length()<2){
            return s.length();
        }
        for(int i=0; i<s.length()-1; i++){
            checkEqual(s,i,i);
            checkEqual(s,i,i+1);
        }
        return length;
    }

    static void checkEqual(String s, int start, int end){
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){

            if(length<end-start+1) {
                length = end - start+1;
                //            begin = start-1;
            }
            start--;
            end++;
        }
    }

    static int longestPossiblePalindrome(String s){
        ArrayList<Character> chars = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            chars.add(s.charAt(i));
        }
        if(s.length()<2){
            return s.length();
        }
        int count = 0;
        for(int i=0; i<chars.size()-1; i++){
            for(int y = i+1; y<chars.size();y++){
                if(chars.get(i).equals(chars.get(y))){
                    count+=2;
                    chars.remove(y);
                    break;
                }
            }
        }if (count<s.length() && count>0){
            count+=1;
        }return count;
    }
}
