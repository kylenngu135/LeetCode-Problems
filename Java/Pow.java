class Solution {
    public double myPow(double x, int n) {
        
        if (n == 0) {
            return 1;
        }

        double extra = 1;
        long m = Math.abs((long) n);
        

        while (m > 1) {
            if (m % 2 == 1) {
                extra *= x;
            }

            x *= x;
            m /= 2;
        }

        x *= extra; 

        if (n < 0) {
            x = 1.0 / x;
        }

        return x;
    }
}
