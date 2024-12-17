package com.yash.corejava;

import java.util.ArrayList;

public class MatchPatternUtil {


    public static int[] matchabSequence(String string) {

        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<string.length()-1;i++)
        {
            if(string.charAt(i)=='a' && string.charAt(i+1)=='b')
            {
                al.add(i);
            }
        }
        return convertListToArray(al);

    }


    public static int[] findDigitLocation(String string)
    {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<string.length();i++)
        {
            if(Character.isDigit(string.charAt(i)))
            {
                al.add(i);
            }
        }
        return convertListToArray(al);
    }

    public static int[] findWhiteSpaces(String string)
    {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<string.length();i++)
        {
            if(Character.isWhitespace(string.charAt(i)))
            {
                al.add(i);
            }
        }
        return convertListToArray(al);
    }

    public static int[] findPattern(String string)
    {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<string.length()-3;i++)
        {
            char firstChar = string.charAt(i);
            char secondChar = string.charAt(i+1);
            char thirdChar = string.charAt(i+2);

            if(firstChar=='O' && (secondChar=='x' || secondChar=='X')&&((thirdChar>='0' && thirdChar<='9')|| thirdChar>='a' && thirdChar<='f')|| (thirdChar>='A' && thirdChar<='F'))
            {
                al.add(i);
            }
        }
        return convertListToArray(al);
    }


    private static int[] convertListToArray(ArrayList<Integer> list)
    {
        int[] result = new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            result[i]=list.get(i);
        }
        return result;
    }
}
