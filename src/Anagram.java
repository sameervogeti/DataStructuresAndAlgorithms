/*
Write a Program to Determine if two Strings are Anagrams.

Example :-
String s1="qwerty"
String s2="ytqwre"

Above Strings are called Anagrams as they can be re-arranged to form each other
* */

import java.util.*;

public class Anagram {
    boolean areAnagrams(String string1,String string2)
    {
        boolean areAnagrams=false;

        if(string1.length()==string2.length())
        {
            Map<Character,Integer> map1=charCounter(string1);
            Map<Character,Integer> map2=charCounter(string2);
            return areAnagrams(map1,map2);
        }

        return areAnagrams;

    }
    Map<Character,Integer> charCounter(String inputString)
    {
        Map<Character,Integer> characterMap=new HashMap<>();
        char[] inputStringCharArray=inputString.toCharArray();
        int counter=1;
        for(char c:inputStringCharArray)
        {
            if(characterMap.containsKey(c))
            {
                characterMap.put(c,characterMap.get(c)+1);
            }
            else
            {
                characterMap.put(c,counter);
            }
        }
        return characterMap;
    }

    boolean areAnagrams(Map<Character,Integer> firstMap,Map<Character,Integer> secondMap)
    {
        boolean areAnagrams=false;
        Set<Character> firstMapCharacterList=firstMap.keySet();
        Set<Character> secondMapCharacterSet=secondMap.keySet();

         if(secondMapCharacterSet.containsAll(firstMapCharacterList))
        {
            areAnagrams=true;
            return areAnagrams;
        }
        return areAnagrams;
    }

    public static void main(String args[])
    {
        Anagram anagram=new Anagram();
        String string1="qwerty";
        String string2="wqrtey";
        System.out.println("Are The Above Strings Anagrams?  "+anagram.areAnagrams(string1,string2));
    }
}
