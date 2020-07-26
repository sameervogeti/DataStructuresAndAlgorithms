/* Given an Input String Reverse the String Word by Word. A Word is defined by Sequence of non-space Characters
The Input String doesn't contain leading or trailing spaces and the words are separated by a single space
*
Sample Input :- "Leonardo Da Vinci"
Sample Output:- "Vinci Da Leonardo"
*/
public class StringReverse
{
    public static void main(String args[])
    {
       String InputString="Main Shayar toh Nahi";
       String originalString[]=InputString.split(" ");
       String reversedString="";

       for(int word=originalString.length-1;word>=0;word--)
       {
           reversedString=reversedString+originalString[word]+" ";
       }
       System.out.println(reversedString);
    }
}
