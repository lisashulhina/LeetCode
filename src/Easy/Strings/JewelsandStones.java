package Easy.Strings;

public class JewelsandStones {
    public int numJewelsInStones(String jewels, String stones) {
        char[] variants = jewels.toCharArray();

        int count = 0;

        for (char instance : stones.toCharArray()){
            for (char variant : variants) {
                if (variant == instance) count++;
            }
        }

        return count;
    }
}
