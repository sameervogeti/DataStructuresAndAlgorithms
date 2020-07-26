public class CharacterFrequencyCountWithoutMap {
    void printCharCount(String input)
    {
        int SIZE=26;
        int n=input.length();
        int[] freq=new int[SIZE];
        for(int i=0;i<n;i++)
        {
            freq[input.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++)
        {
            if(freq[input.charAt(i)-'a']!=0)
            {
                System.out.print(input.charAt(i));
                System.out.print(freq[input.charAt(i)-'a']+" ");

                freq[input.charAt(i)-'a']=0;
            }
        }
    }

    public static void main(String args[])
    {
        CharacterFrequencyCountWithoutMap characterFrequencyCountWithoutMap=new CharacterFrequencyCountWithoutMap();
        characterFrequencyCountWithoutMap.printCharCount("sameer");
    }
}
