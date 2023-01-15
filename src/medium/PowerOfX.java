package medium;

public class PowerOfX {
    public static void main(String[] args) {
        System.out.println(powLogRecursive(2, -4));
    }

    //Todo : Not Optimal
    public static double myPow(double x, int n) {
        double res = 1;
        int end = Math.abs(n);
        if (n > 0) {
            for (int i = 0; i < end; ++i) {
                res *= x;
            }
        } else if (n < 0) {
            for (int i = 0; i < end; ++i) {
                res /= x;
            }
        }
        return res;
    }

    //Todo : Not Optimal
    public static double myPowRecursive(double x, int n) {
        if (n == -1) return (1 / x);
        if (n == 0)
            return 1.0;
        if (n < 0) {
            return (1 / x) * myPowRecursive(x, n + 1);
        }

        return x * myPowRecursive(x, n - 1);
    }


    public static double powLogRecursive(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        if (n == -1) return 1 / x;
        double oneSide;
        boolean isNEven = Math.abs(n) % 2 == 0;


        if (n < 0 && !isNEven)
            return (1 / x) * powLogRecursive(x, n + 1);
        if (isNEven) {
            oneSide = powLogRecursive(x, n / 2);
        } else {
            oneSide = powLogRecursive(x, n - 1);
            return oneSide * x;
        }
        return oneSide * oneSide;
    }
}

/**
 *
 *         if (n < 0){
 *             if (isNEven){
 *                 oneSide = powLogRecursive(x, n / 2);
 *                 return oneSide * oneSide;
 *             }else{
 *
 *             }
 *         }
 *
 *
 */

