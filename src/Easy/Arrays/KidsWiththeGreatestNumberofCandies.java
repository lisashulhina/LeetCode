package Easy.Arrays;

import java.util.LinkedList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new LinkedList<>();

        for (int instance : candies) {
            boolean flag = true;
            for (int i = 0; i < candies.length; i++) {
                if (instance + extraCandies < candies[i]) {
                    flag = false;
                }
            }
            result.add(flag);
        }

        return result;
    }
}
