package easy;



//https://leetcode.com/problems/roman-to-integer/

public class RomanToInteger {

    public static void main(String[] args) {



        System.out.println(convert("LVIII"));
        System.out.println(convert("MCMXCIV"));
        System.out.println(convert("M"));

    }

    static int convert( String roman){
        int result = 0;
        for (int i = 0; i < roman.length(); ++i){
            if (i < roman.length() - 1 && romanCharValue(roman.charAt(i)) < romanCharValue(roman.charAt(i + 1))) {
                    result -= romanCharValue(roman.charAt(i));
            }else{
                result += romanCharValue(roman.charAt(i));
            }
        }

        return result;
    }

    static int romanCharValue(char x){
        return switch (x) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
