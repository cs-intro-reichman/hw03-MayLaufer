/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String newString = "";

        for (int i = 0; i < s.length(); i++) {
            String currChar = String.valueOf(s.charAt(i)); 
            if (s.indexOf(currChar) == i || s.charAt(i) == ' ') {
                newString = newString + s.charAt(i);
            }
        }

        return newString;
    }
}
