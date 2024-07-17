class Solution {
    public List<Integer> findAnagrams(String s, String p) 
    {
        char[] ch1 = s.toCharArray();
        char[] ch2 = p.toCharArray();

        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(ch2);

        int len = ch2.length;
        for (int i=0; i<=ch1.length-len; i++)
        {
            String str = s.substring(i, i+len);
            char[] words = str.toCharArray();
            Arrays.sort(words);

            if (Arrays.equals(ch2, words))
            {
                list.add(i);
            }
        }    
        return list;
    }
}