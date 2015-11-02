package com.headcrest.sorting.ex;

public class PatternMatching {

    public int matchString(String string, String pattern){

        String matching = "";
        int currentIndexOfPattern = 0;
        int possibleMatchIndex = -1;

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch == pattern.charAt(currentIndexOfPattern)){
                if (possibleMatchIndex == -1)
                    possibleMatchIndex = i;
                matching += ch;
                currentIndexOfPattern++;
            }else{
                currentIndexOfPattern = 0;
                possibleMatchIndex = -1;
                matching = "";
            }

            if (matching.equals(pattern)){
                return possibleMatchIndex;
            }
        }

        return 0;
    }
}
