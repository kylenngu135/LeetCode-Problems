class Solution {
    public int myAtoi(String s) {
        int start = 0;
        int sign = 1;
        int sum = 0;
        boolean signSeen = false;

        char[] list = s.toCharArray();

        while (start < list.length) {
            int checkInt = (((int) list[start]) - 48);
            if (checkInt >= 0 && checkInt < 10) {
                break;
            } else if (checkInt == -3) {
                if (signSeen) {
                    return 0;
                }
                sign = -1;
                signSeen = true;
            } else if (checkInt == -5) {
                if (signSeen) {
                    return 0;
                }
                sign = 1;
                signSeen = true;
            } else if (checkInt != -16) {
                return 0;
            } else if (signSeen && checkInt == -16) {
                return 0;
            }
            start++;
        }


        boolean leftover = false;

        while (start < list.length) {
            int checkInt = (((int) list[start]) - 48);

            if (checkInt < 0 || checkInt > 9) {
                break;
            } 
            int prev = sum;
            sum *= 10;
            sum += ((int) list[start]) - 48;  

            if (prev != sum / 10) {
                sum = Integer.MAX_VALUE;
                if (sign == -1) {
                    leftover = true;
                }
                break;
            }
            start++;
        }

        sum *= sign;

        if (sign == -1 && leftover) {
            sum -= 1;
        }

        return sum;
    }
}
