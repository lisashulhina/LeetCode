package Easy.Strings;

public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        int length = indices.length;
        char[] newString = new char[length];

        for (int i = 0; i < length; i ++){
            newString[indices[i]] = s.charAt(i);
        }

        return new String(newString);
    }

    public static void main(String[] args){

        ShuffleString shuffleString = new ShuffleString();
        System.out.println(shuffleString.restoreString("codeleet", new int[] {4,5,6,7,0,2,1,3}));

    }
}
