class Solution {
    public String sortVowels(String s) 
    {
        ArrayList<Character> list = new ArrayList<>();

        String str = "";

        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch=='U')
            {
                list.add(ch);
            }
        }

        list.sort(null);
        int k = 0;

        for(int j=0; j<s.length(); j++)
        {
            char ch = s.charAt(j);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch=='U')
            {
                str = str + list.get(k);
                k++;
            }
            else
            {
                str = str + ch;
            }
        }

        return str;    
    }
}