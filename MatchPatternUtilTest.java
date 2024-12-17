package com.yash.corejava;

import java.util.Arrays;

public class MatchPatternUtilTest {

    public static void main(String[] args) {

        MatchPatternUtilTest t = new MatchPatternUtilTest();

        MatchPatternUtil m = new MatchPatternUtil();

        String str1="abaaaba";
        int[] matchedIndexNumber = MatchPatternUtil.matchabSequence(str1);
        System.out.println(Arrays.toString(matchedIndexNumber));

        String str2="a12c3e456f9";
        int[] digitLocation = MatchPatternUtil.findDigitLocation(str2);
        System.out.println(Arrays.toString(digitLocation));

        String str3="a 1 56 _z";
        int[] whiteSpaces = MatchPatternUtil.findWhiteSpaces(str3);
        System.out.println(Arrays.toString(whiteSpaces));

        String str4="12 Ox Ox12OXf OXg";
        int[] findPattern = MatchPatternUtil.findPattern(str4);
        System.out.println(Arrays.toString(findPattern));








    }
}
