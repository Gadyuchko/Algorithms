import java.util.Stack;

/*
Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string
inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid;
there are no extra white spaces, square brackets are well-formed, etc.
Furthermore, you may assume that the original data does not contain any digits and
that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].

The test cases are generated so that the length of the output will never exceed 105.
 */
public class DecodeString {
    public static void main(String[] args) {
        String s="3[a]2[bc]";
        String s1="3[a2[c]]";
        String s2="2[abc]3[cd]ef";
        String s3 ="fgf3[ce2[a]]fe";
//        System.out.println(decodeString(s));
//        System.out.println(decodeString(s1));
//        System.out.println(decodeString(s2));
        System.out.println(decodeString(s3));
    }
    static String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        Stack<Integer> multipliers = new Stack<>();
        StringBuilder result = new StringBuilder();
        int index =0;

        while(index<s.length()){
            if(Character.isDigit(s.charAt(index))){
                int count =0;
                while(Character.isDigit(s.charAt(index))){
                    count = count*10 +  Character.getNumericValue(s.charAt(index));
                    index+=1;
                }
                multipliers.push(count);
            }else if(s.charAt(index)=='['){
                stack.push(result.toString());
                result.delete(0, result.length());
                index+=1;
            }else if(s.charAt(index)==']'){
                int count = multipliers.pop();
                StringBuilder temp = new StringBuilder(stack.pop());
                temp.append(String.valueOf(result).repeat(count));
                result.delete(0, result.length());
                result.append(temp);
                index+=1;
            }else{
                result.append(s.charAt(index));
                index+=1;
            }
        }
        return result.toString();
    }
}
