class Solution {
    public int fib(int n) {
        if (n < 2) {
            return n;
        }

        int n0 = 0;
        int n1 = 1;
        int fib = 0;

        for (int i = 0; i < n - 1; i++) {
            fib = n1 + n0;
            n0 = n1;
            n1 = fib;
        }

        return fib;

    }
}
