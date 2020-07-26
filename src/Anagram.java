/*
Write a Program to Determine if two Strings are Anagrams.
PS :- For simplicity Sake, let's assume all letters are lower case and there are no special characters like
Space or Alpha Numeric
What is an Anagram?
An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.

Example :-
String s1="qwerty"
String s2="ytqwre"
areAnagrams(s1,s2) ==> Should Return False

String s1="aaz"
String s2="zza"
areAnagrams(s1,s2) ==> Should Return False
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

        for(Character c:firstMapCharacterList)
        {
            if(secondMap.get(c)==firstMap.get(c))
            {
                areAnagrams=true;
            }
        }

        return areAnagrams;
    }

    public static void main(String args[])
    {
        Anagram anagram=new Anagram();
        String string1="awesome";
        String string2="awesom";
        System.out.println("Are The Above Strings Anagrams?  "+anagram.areAnagrams(string1,string2));
    }
}
