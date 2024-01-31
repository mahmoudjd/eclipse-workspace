package zigzag;

public class ZigZagConversion {

    public static String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        String[] rows = new String[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = "";
        }

        int index = 0;
        int direction = 1; // 1 for down, -1 for up

        for (char c : s.toCharArray()) {
            rows[index] += c;
            if (index == 0) {
                direction = 1;
            } else if (index == numRows - 1) {
                direction = -1;
            }
            index += direction;
        }

        String result = "";
        for (String row : rows) {
            result += row;
        }

        return result;
    
    }

	public static void main(String[] args) {
		// Example usage:
		System.out.println(convert("PAYPALISHIRING", 3)); // Output: "PAHNAPLSIIGYIR"
		
		System.out.println(convert("PAYPALISHIRING", 4)); // Output: "PINALSIGYAHRPI"
		/*
		 * P     I    N
		 * A   L S  I G
		 * Y A   H R
		 * P     I	
		 */
		System.out.println(convert("A", 1)); // Output: "A"

	}
}
