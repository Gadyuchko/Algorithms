public class FibonacciNumbers {
    static int one = 0;
    static int two = 1;
    static int result = 1;

    public static void main(String[] args) {
        System.out.println(fib(7));
    }
    static int fib(int n) {
        if( n ==0){
            result = 0;
        }
       if(n>1){
            result=one+two;
            one=two;
            two=result;
            fib(n-1);
        }return result;
    }
}
