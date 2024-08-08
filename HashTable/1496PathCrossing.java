class Solution {
    public boolean isPathCrossing(String path) 
    {
        HashSet<String> set = new HashSet<>();
        int x = 0;
        int y = 0;

        set.add("0,0");

        for (char ch : path.toCharArray()) 
        {
            if (ch == 'N') 
            {
                y++;
            }
            else if (ch == 'S') 
            {
                y--;
            }
            else if (ch == 'E') 
            {
                x++;
            }
            else if (ch == 'W') 
            {
                x--;
            }

            String currentPos = x + "," + y;

            if (set.contains(currentPos)) 
            {
                return true;
            }

            set.add(currentPos);
        }

        return false;    
    }
}