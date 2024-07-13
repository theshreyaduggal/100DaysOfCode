class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i=0; i<arr1.length; i++)
        {
            if (map.containsKey(arr1[i]))
            {
                map.put(arr1[i], map.get(arr1[i])+1);
            }
            else
            {
                map.put(arr1[i], 1);
            }
        }
        for (int j=0; j<arr2.length; j++)
        {
            if (map.containsKey(arr2[j]))
            {
                for (int k=0; k<map.get(arr2[j]); k++)
                {
                    list.add(arr2[j]);
                }
            }
            map.remove(arr2[j]);
        }  

        if (!map.isEmpty())
        {
            for (int key : map.keySet())
            {
                for (int i=0; i<map.get(key); i++)
                {
                    list2.add(key);
                }
            }
        }

        list2.sort(null);
        for (int i=0; i<list2.size(); i++)
        {
            list.add(list2.get(i));
        }
        
        for (int j=0; j<list.size(); j++)
        {
            arr1[j] = list.get(j);
        }

        return arr1;
    }
}