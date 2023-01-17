package easy;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {


        int result = 0;
        int p = x;

        while (p != 0) {
            int last = p % 10;
            p /= 10;
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && last > 7)) return 0;
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && last < -8)) return 0;
            result = result * 10 + last;
        }

        return result;
    }


}
