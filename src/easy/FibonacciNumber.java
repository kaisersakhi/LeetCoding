package easy;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    static int fib(int n){
        if (n <= 1) return n;
        int pre = 0;
        int cur = 1;
        for (int i = 1; i < n; ++i){
            cur = cur + pre;
            pre = cur - pre;
        }
        return cur;
    }
}
