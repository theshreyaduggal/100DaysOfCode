class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) 
    {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i=0; i<arr.length-1; i++)
        {
            if (min > Math.abs(arr[i]-arr[i+1]))
            {
                min = Math.abs(arr[i]-arr[i+1]);
            }
        } 

        List<List<Integer>> list = new ArrayList<>();
        for (int i=0; i<arr.length-1; i++)
        {
            if (Math.abs(arr[i]-arr[i+1]) == min)
            {
                List<Integer> ans = new ArrayList<>();
                ans.add(arr[i]);
                ans.add(arr[i+1]);
                list.add(ans);
            }            
        } 
        return list;  
    }
}