package Easy.Strings;

import java.util.Arrays;

public class MaximumNumberofWordsFoundinSentences {
    public int mostWordsFound(String[] sentences) {
        int maxNumOfWords = 0, maxNumOfWordsInSetence;
        for ( String sentence : sentences){
            maxNumOfWordsInSetence = (int) Arrays.stream(sentence.split("\\s+")).count();
            if (maxNumOfWordsInSetence > maxNumOfWords) maxNumOfWords = maxNumOfWordsInSetence;
        }

        return maxNumOfWords;
    }

    public static void main(String[] args){

        MaximumNumberofWordsFoundinSentences maximumNumberofWordsFoundinSentences = new MaximumNumberofWordsFoundinSentences();
        System.out.println(maximumNumberofWordsFoundinSentences.mostWordsFound(new String[] {"alice and bob love leetcode","i think so too","this is great thanks very much"}));

    }
}
