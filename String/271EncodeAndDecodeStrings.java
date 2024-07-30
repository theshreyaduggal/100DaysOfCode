class Solution {

    public String encode(List<String> strs) 
    {
        String str = "";
        for (String s : strs)
        {
            str = str + (char)(s.length()) + s;
        }
        System.out.println("STR: " + str);
        return str;
    }

    public List<String> decode(String str) 
    {
        ArrayList<String> list = new ArrayList<>();
        int i = 0;
        int n = str.length();
        while (i < n) 
        {
            int size = str.charAt(i);
            i++;
            list.add(str.substring(i, i + size));
            i = i + size;
        }
        return list;
    }
}
