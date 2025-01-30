class Solution {
    public String addBinary(String a, String b) {
        // Step 1: Find the longer and shorter string
        String shorterString = "";
        String longerString = "";
        if (a.length() > b.length()) {
            longerString = a;
            shorterString = b;
        } else {
            longerString = b;
            shorterString = a;
        }

        // Step 2: Pad the shorter string with leading zeros to make them equal length
        while (shorterString.length() < longerString.length()) {
            shorterString = "0" + shorterString;
        }

        int carry = 0;
        StringBuilder result = new StringBuilder();

        // Step 3: Perform binary addition using a for loop, from the end to the start
        for (int i = shorterString.length() - 1; i >= 0; i--) {
            int bit1 = shorterString.charAt(i) - '0';  // Convert char to int
            int bit2 = longerString.charAt(i) - '0';   // Convert char to int
            int sum = bit1 + bit2 + carry;

            // Determine the new carry and the result bit
            carry = sum / 2;  // Carry is 1 if sum is 2 or greater
            result.append(sum % 2);  // Current bit is sum % 2 (0 or 1)
        }

        // If there's a carry left, append it
        if (carry != 0) {
            result.append(carry);
        }

        // Step 4: Reverse the result string because we built it from the least significant bit
        return result.reverse().toString();

    }
}
