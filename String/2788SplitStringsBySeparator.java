class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) 
    {
        ArrayList<String> list = new ArrayList<>();

        for (String s: words)
        {
            String[] str = s.split("\\Q" + separator +"\\E");

            for (String a : str)
            {
                if(!a.isEmpty())
                {
                    list.add(a);
                }
            }
        }    
        return list;
    }
}