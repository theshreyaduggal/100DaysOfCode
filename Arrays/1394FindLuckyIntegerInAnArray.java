class Solution {
    public int findLucky(int[] arr) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<arr.length; i++)
        {
            if (map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i], 1);
            }
        }   
        for (int j=0; j<arr.length; j++)
        {
            if (arr[j]==map.get(arr[j]) && list.contains(arr[j])==false)
            {
                list.add(arr[j]);
            }
        } 
        if (list.isEmpty())
        {
            return -1;
        }
        else
        {
            list.sort(null);
            return list.get(list.size()-1);
        }
    }
}