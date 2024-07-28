class Solution {
    public int maximumNumberOfStringPairs(String[] words) 
    {
        ArrayList<String> list = new ArrayList<>();
        int count = 0;
        for (int i=0; i<words.length; i++)
        {
            list.add(words[i]);
        }  
        System.out.println(list);
        for (int i=0; i<list.size(); i++)
        {
            String str = list.get(i);
            String rev = reverseString(str);
           
            for (int k=i+1; k<list.size(); k++)
            {
                if (list.get(k).equals(rev))
                {
                    count++;
                }
            }
        }
        return count;
    }

    public static String reverseString(String str)
    {
        String rev = "";
        for (int j=str.length()-1; j>=0; j--)
		{
            rev = rev + str.charAt(j);
		}
        return rev;
    }
}