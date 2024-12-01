public class MyString {
    public static void main(String[] args) {
     
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)  >= 'A' && str.charAt(i) <= 'Z') {
                newString += (char) (str.charAt(i) + 32);
            } else {
                newString += str.charAt(i);
            }
        }
        return newString;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if (str2 == "") {
            return true;
        }
        if (str1.length() < str2.length()) {
            return false;
        }
        boolean match = false;
        int ch1 = 0;
        int ch2 = 0;
        while (ch1 < str1.length()) {
            if (str1.charAt(ch1) != str2.charAt(ch2)) {
                ch2 = 0;
                match = false;
                ch1++;
            } else {
                match = true;
                ch1++;
                ch2++;
                if (ch2 == str2.length()){ 
                    break;
                }
            }
        }
        return match;
    }
}
