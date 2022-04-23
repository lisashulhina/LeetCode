package Easy.Arrays;

public class ShuffletheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] newArray = new int[2*n];

        for (int i=0; i<n; i++){
            newArray[ i * 2 ] = nums[i];
            newArray[ i * 2 + 1] = nums[i + n];
        }

        return newArray;
    }
}
