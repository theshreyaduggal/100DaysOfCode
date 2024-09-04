class Solution {
    public int robotSim(int[] commands, int[][] obstacles)
    {
        int x = 0;
        int y = 0;
        int d = 0;

        int[][] direction = {{0,1},{1,0},{0,-1},{-1,0}};
        HashSet<String> set = new HashSet<>();
        int maxDistance = 0;

        for(int[] obstacle : obstacles)
        {
            set.add(obstacle[0] + "," + obstacle[1]);
        }

        for(int cmd : commands)
        {
            if (cmd == -1)
            {
                d = (d+1) % 4;
            }
            else if(cmd == -2)
            {
                d = (d+3) % 4;
            }
            else
            {
                for(int i=0; i<cmd; i++)
                {
                    int nx = x + direction[d][0];
                    int ny = y + direction[d][1];

                    if(set.contains(nx + "," + ny ))
                    {
                        break;
                    }
                    
                    x = nx;
                    y = ny;

                    maxDistance = Math.max(maxDistance, x*x+y*y);
                }
            }
        }
        
        return maxDistance;    
    }
}