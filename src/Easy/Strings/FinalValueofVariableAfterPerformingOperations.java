package Easy.Strings;

public class FinalValueofVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String operation : operations ){
            if(operation.charAt(1)=='+') x ++;
            if(operation.charAt(1)=='-') x --;
        }

        return x;
    }
}
