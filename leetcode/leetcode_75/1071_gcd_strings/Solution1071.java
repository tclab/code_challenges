public class Solution1071 {

    public static String gcdOfStrings(String str1, String str2) {

        // str1 = "ABCABC", str2 = "ABC"
        String result = "";
        for (int i = 1; i <= Math.min(str1.length(), str2.length()); i++){
            String gcd = str1.substring(0, i);
            if (isGcd(str1, gcd) && isGcd(str2, gcd)) result = gcd;
        }

        return result;
    }

    public static boolean isGcd(String string, String gcd) {
        if (string.length() % gcd.length() != 0) return false;
        String actual = gcd.repeat(string.length()/gcd.length());
        return actual.equals(string);
    }

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABABABAB", "ABAB"));
    }
}