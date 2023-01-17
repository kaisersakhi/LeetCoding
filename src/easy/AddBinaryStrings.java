package easy;

public class AddBinaryStrings {
    public static void main(String[] args) {
        AddBinaryStrings obj = new AddBinaryStrings();
        System.out.println(obj.addBinary1("1111", "0"));
    }

    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0)
                sum += a.charAt(i--) - '0';
            if(j >= 0)
                sum += b.charAt(j--) - '0';
            carry = sum > 1 ? 1 : 0;
            res.append(sum % 2);
        }
        if(carry != 0) res.append(carry);
        return res.reverse().toString();
    }
    public String addBinary1(String a, String b) {
        boolean is_a_bigger = a.length() > b.length();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("0".repeat((is_a_bigger ? a.length() - b.length() : b.length() - a.length())));
        stringBuilder.append(is_a_bigger ? b : a);
        if (is_a_bigger) b = stringBuilder.toString();
        else a = stringBuilder.toString();

        int carry = 0;
        StringBuilder result = new StringBuilder();
        for (int i = a.length() - 1; i >= 0; --i) {
            if (a.charAt(i) == '1' && b.charAt(i) == '1' && carry == 1) {
                result.append('1');
                carry = 1;
            } else if (a.charAt(i) == '1' && b.charAt(i) == '1' && carry == 0) {
                result.append('0');
                carry = 1;
            } else if ((a.charAt(i) == '1' && b.charAt(i) == '0' && carry == 0) || (a.charAt(i) == '0' && b.charAt(i) == '1' && carry == 0)) {
                result.append('1');
                carry = 0;
            } else if ((a.charAt(i) == '1' && b.charAt(i) == '0' && carry == 1) || (a.charAt(i) == '0' && b.charAt(i) == '1' && carry == 1)) {
                result.append('0');
                carry = 1;
            } else if ((a.charAt(i) == '0' && b.charAt(i) == '0' && carry == 1)) {
                result.append('1');
                carry = 0;
            }else if ((a.charAt(i) == '0' && b.charAt(i) == '0' && carry == 0)){
                result.append('0');
                carry = 0;
            }
        }
//        stringBuilder.
//        System.out.println(result);
        if (carry == 1) {
            result.append('1');
        }
        return result.reverse().toString();
    }
}
