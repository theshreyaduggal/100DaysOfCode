class Solution {
    public String[] findWords(String[] words) 
    {
        ArrayList<String> list = new ArrayList<>();
        for (int i=0; i<words.length; i++)
        {
            String word = words[i];
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            for (int j=0; j<word.length(); j++)
            {
                char ch = Character.toLowerCase(word.charAt(j));
                if ("qwertyuiop".contains(ch+""))
                {
                    count1++;
                }
                else if ("asdfghjkl".contains(ch+""))
                {
                    count2++;
                }
                else if ("zxcvbnm".contains(ch+""))
                {
                    count3++;
                }
            }
            if (count1 == word.length() || count2==word.length() || count3==word.length())
            {
                list.add(word);
            }
        }

        String[] array = new String[list.size()];
        for (int i=0; i<list.size(); i++)
        {
            array[i] = list.get(i);
        }
        return array;
    }
}