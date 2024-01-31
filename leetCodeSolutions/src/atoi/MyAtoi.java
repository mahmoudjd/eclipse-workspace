package atoi;

public class MyAtoi {
    public static int myAtoi(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        int sign = 1;
        int result = 0;
        int i = 0;

        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Check for overflow before updating the result.
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return sign * result;
    }
    
    public static void main(String[] args) {
    	String s =	"4193 with words";
    	System.out.println(myAtoi(s));
	}
}
