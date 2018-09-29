public class StringUtil {
    /**
     * Concat two string together.
     * 
     * @param a String to concat
     * @param b String to concat
     * @return concaternated result of a and b
     */
    public static String concat(String a, String b) {
        return a + b;
    }

    /**
     * Check for duplicate character in string and remove
     * 
     * @return string with no duplicate character
     */
    public static String remove_duplicate(String a) {
        for (int i = 0; i < a.length()-1; i++) {
            if (a.charAt(i) == a.charAt(i + 1)) {
                a = a.substring(0, i) + a.substring(i + 1, a.length());
                i-=1;
            }
        }

        return a;
    }

    /**
     * Duplicate string for specified round
     * 
     * @return string with specified round
     */
    public static String duplicate(String a, int round) {
        String result = "";
        for (int i = 0; i < round; i++) {
            result += a;
        }

        return result;
    }

    /**
     * Find character in string and return index of a
     * 
     * @param a String to find character
     * @param c character to find
     * @return index of character -1 if not found
     */
    public static int find(String a, char c) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == (c)) {
                return i;
            }
        }

        return 0;
    }
}