class Solution {
    public int maximumRemovals(String s, String p, int[] removable) 
    {
        int start = 0;
        int end = removable.length;
        int[] array = new int[s.length()];
        
        Arrays.fill(array, removable.length);
        for (int i=0; i<removable.length; i++)
        {
            array[removable[i]] = i;
        }    
        while (start < end) 
        {
            int mid = (start + end + 1) / 2;
            int j = 0;
            for (int i=0; i<s.length() && j<p.length(); i++)
            {
                if (array[i] >= mid && s.charAt(i) == p.charAt(j))
                {
                    j++;
                }
            }
            if (j == p.length())
            {
                start = mid;
            }
            else
            {
                end = mid - 1;
            }
        }
        return start;    
    }
}