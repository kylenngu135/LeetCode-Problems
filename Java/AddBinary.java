/*
    Given two binary strings a and b, return their sum as a binary string.

    Example 1:

    Input: a = "11", b = "1"
    Output: "100"

    Example 2:

    Input: a = "1010", b = "1011"
    Output: "10101"
 */

class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder str = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) { sum += a.charAt(i--) - '0';}
            if (j >= 0) { sum += b.charAt(j--) - '0';}
            carry = sum > 1 ? 1 : 0;
            str.append(sum % 2);
        }
        if (carry != 0) {str.append(carry);}
        return str.reverse().toString();
    }
}
