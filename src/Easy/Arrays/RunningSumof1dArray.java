package Easy.Arrays;

public class RunningSumof1dArray {
    public int[] runningSum(int[] nums) {
        int[] newArray = new int[nums.length];

        for (int i=1; i < nums.length; i++){
            int sum = 0;
            for (int j=0; j<=i; j++){
                sum += nums[j];
            }
            newArray[i] = sum;
        }

        return newArray;
    }
}
