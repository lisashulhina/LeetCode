package Easy.Arrays;

public class ConcatenationofArray {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] newArray = new int[2*length] ;

        for (int i = 0; i < length; i++){
            newArray[i] = nums[i];
            newArray[i + length] = nums[i];
        }

        return newArray;
    }
}
