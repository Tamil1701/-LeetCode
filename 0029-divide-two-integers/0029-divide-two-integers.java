class Solution {
    public int divide(int dividend, int divisor) {
        // Handle division by zero
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }

        // Handle overflow case: when dividend is Integer.MIN_VALUE and divisor is -1
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;  // This case overflows, so we return the maximum integer value
        }

        // Quick return when dividing by 1 or -1
        if (divisor == 1) {
            return dividend;  // Dividing by 1 returns the dividend itself
        }
        if (divisor == -1) {
            return -dividend;  // Dividing by -1 returns the negation of the dividend
        }

        // Determine the sign of the result
        boolean negativeResult = (dividend < 0) ^ (divisor < 0);  // XOR: true if only one is negative

        // Convert both dividend and divisor to their absolute values
        long div = Math.abs((long) dividend);  // Using long to handle overflow
        long divs = Math.abs((long) divisor);  // Using long to handle overflow

        // Perform the division using repeated subtraction
        int cnt = 0;
        while (div >= divs) {
            div -= divs;
            cnt++;
        }

        // If the result should be negative, return the negated count
        return negativeResult ? -cnt : cnt;
    }
}
