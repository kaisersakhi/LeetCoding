package easy;

//https://leetcode.com/problems/longest-common-prefix/
public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(getLongestPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(getLongestPrefix(new String[]{"a"}));
        System.out.println(getLongestPrefix(new String[]{""}));
        System.out.println(getLongestPrefix(new String[]{"ab","abl"}));
        System.out.println(getLongestPrefix(new String[]{"ab",""}));
    }

    static String getLongestPrefix(String[] words) {
        if (words.length == 1 && words[0].length() == 0) return "";
        if (words.length == 1 && words[0].length() == 1) return String.valueOf(words[0].charAt(0));
        StringBuilder result = new StringBuilder();
        StringBuilder preString = new StringBuilder(words[0]);
        for (int i = 1; i < words.length; ++i){

            int limit = Math.min(preString.length(), words[i].length());
            for (int j = 0; j < limit; ++j){
                if (preString.charAt(j) == words[i].charAt(j)){
                    result.append(preString.charAt(j));
                }else {
                  break;
                }
            }
            preString = new StringBuilder(result.toString());
            result.delete(0, result.length());
        }
        return preString.toString();
    }

}
