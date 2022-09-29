import java.util.Stack;

/*
Given two strings s and t, return true if they are equal when both are typed into empty text editors.
'#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.
 */
public class BackspaceStringCompare {
    public static void main(String[] args) {
        String s = "aa#ca#";
        String t = "#";
        String s1 = "a##c";
        String t1 = "#a#c";
        System.out.println(backspaceCompare(s1,t1));
    }

    static boolean backspaceCompare(String s, String t) {
        return  (backspace(s).equals(backspace(t)));
    }
    static String backspace(String g){
        Stack<Character> stack = new Stack<>();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i<g.length(); i++){
            if(g.charAt(i)=='#'){
                if(!stack.empty()){
                    stack.pop();
                }
            }else {
                stack.push(g.charAt(i));
            }
        }
        while(!stack.empty()){
            builder.append(stack.pop());
        }
        return builder.toString();
    }
}
