public class TasksWithTypeConversion {

    private static char charExpression(int a) {
        return (char)((int)'\\' + a);
    }

    private static boolean isPowerOfTwo(int value) {
        return Integer.bitCount(Math.abs(value)) == 1;
    }

    private static boolean isPalindrome(String text) {
        text = text.replaceAll("[^a-zA-Z0-9]", "");

        StringBuilder reverseText = new StringBuilder();
        reverseText.append(text);
        reverseText = reverseText.reverse();

        return text.equalsIgnoreCase(reverseText.toString());
    }

    public static void main(String[] args) {
        int xs = 29;
        System.out.println(charExpression(xs));
        System.out.println(isPowerOfTwo(64));

        String s = "Madam, I'm Adam!";
        System.out.println(isPalindrome(s));
    }
}
