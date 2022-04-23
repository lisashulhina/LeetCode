package Easy.Strings;

public class DefanginganIPAddress {
    public String defangIPaddr(String address) {
        StringBuilder newString = new StringBuilder();
        for (char part : address.toCharArray()){
            if (part == '.'){
                newString.append("[.]");
            } else {
                newString.append(part);
            }
        }

        return newString.toString();
    }
}
