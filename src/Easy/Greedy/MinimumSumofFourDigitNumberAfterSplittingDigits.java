package Easy.Greedy;

import java.util.Arrays;

public class MinimumSumofFourDigitNumberAfterSplittingDigits {
    public int minimumSum(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);
        int a = digits[2] - '0' + digits[3] - '0';
        int b = digits[0] - '0' + digits[1] - '0';

        return b * 10 + a;
    }
}
