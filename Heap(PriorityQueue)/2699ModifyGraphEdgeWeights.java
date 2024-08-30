class Solution {
    public int[][] modifiedGraphEdges(int n, int[][] edges, int source, int destination, int target) 
    {
        List<List<int[]>> list = new ArrayList<>();
        
        for(int i=0; i<n; i++) 
        {
            list.add(new ArrayList<>());
        }

        for(int[] edge: edges) 
        {
            if(edge[2] == -1) 
            {
                continue;
            }

            list.get(edge[0]).add(new int[]{edge[1], edge[2]});
            list.get(edge[1]).add(new int[]{edge[0], edge[2]});
        }

        int num = dijkstra(list, source, destination, n);
        int walked = 0;

        if(num < target) 
        {
            return new int[][] { };
        }

        if(num == target) 
        {
            for(int e[]: edges) 
            {
                if(e[2] == -1) 
                {
                    e[2] = 1000000000;
                }
            }

            return edges;
        }

        for(int[] edge: edges) 
        {
            if(edge[2] == -1) 
            {
                list.get(edge[0]).add(new int[]{edge[1], 1});
                list.get(edge[1]).add(new int[]{edge[0], 1});
                
                int res = dijkstra(list, source, destination, n);
                
                if(res <= target) 
                {
                    edge[2] = Math.max(target - res + 1, 1);
                    
                    for(int[] e: edges) 
                    {
                        if(e[2] == -1) 
                        {
                            e[2] = 1000000000;
                        }
                    }
                    return edges;
                } 
                else 
                {
                    edge[2] = 1;
                    walked ++;
                }
            }
        }

        return new int[][] { };
    
    }

    public int dijkstra(List<List<int[]>> list, int source, int destination, int n) 
    {
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));

        queue.add(new int[]{source, 0});
        boolean[] visited = new boolean[n];
        
        while(!queue.isEmpty()) 
        {
            int[] curr = queue.poll();
            visited[curr[0]] = true;
            
            if(curr[0] == destination) 
            {
                return curr[1];
            }

            for(int[] neighbor: list.get(curr[0])) 
            {
                if(visited[neighbor[0]]) 
                {
                    continue;
                }

                queue.add(new int[]{neighbor[0], neighbor[1] + curr[1]});
            }
        }

        return Integer.MAX_VALUE;
    }
}