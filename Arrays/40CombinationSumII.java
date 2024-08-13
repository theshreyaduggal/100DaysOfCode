class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates, target, 0, new ArrayList<>(), list, 0);
        
        return list;       
    }

    public void solve(int[] candidates, int target,int idx, List<Integer> list, List<List<Integer>> res, int sum)
    {
        if (idx > candidates.length || sum > target) 
        {
            return;
        }
        if (sum == target) 
        {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int j=idx; j<candidates.length; j++) 
        {
            if (j > idx && candidates[j] == candidates[j-1]) 
            {
                continue;
            }

            list.add(candidates[j]);
            solve(candidates, target, j+1, list, res, sum+candidates[j]);
            list.remove(list.size()-1);
        }

        return;
    }
}