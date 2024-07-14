class Solution {
    public String reverseVowels(String s) 
    {
        char[] array = s.toCharArray();
        char temp;
        int len = array.length-1;
        for (int i = 0; i<len;)
        {
            if (!isVowel(array[i]))
            {
                i++;
            }
            
            else if (!isVowel(array[len]))
            {
                len--;
            }
            else 
            {
                temp = array[i];
                array[i] = array[len];
                array[len] = temp;
                i++;
                len--;
            }
        } 
        String str = String.valueOf(array);
        return str;

    }

    public boolean isVowel(char a)
    {
        if (a =='a' || a =='e' || a =='i' || a =='o' || a =='u' || a =='A' || a =='E' || a =='I' || a =='O' || a =='U')
        {
            return true;
        }
        return false;
    }
}