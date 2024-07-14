class Solution {
    public int[] shortestToChar(String s, char c) 
    {
        int[] array = new int[s.length()];
        ArrayList<Integer> list = new ArrayList<>();

        int position = 0;

        for (int i=0; i<s.length(); i++)
        {
            if (s.charAt(i) == c)
            {
                list.add(i);
            }
        }    

        int k=0;
        for (int i=0; i<s.length(); i++)
        {
            if (position == list.size())
            {
                array[k] = i - list.get(position-1);
                k++;
            }
            else
            {
                int num = list.get(position);
                
                if (i== num)
                {
                    array[k] = 0;
                    position++;
                    k++;
                }
                else if (position == 0)
                {
                    array[k] = num - i;
                    k++;
                }
                else
                {
                    int num2 = list.get(position-1);
                    array[k] = Math.min(i-num2, num-i);
                    k++;
                }
            }
        }
        return array;
    }
}