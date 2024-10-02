class Solution {
    public int[] arrayRankTransform(int[] arr) 
    {
        if (arr.length == 0)
        {
            return arr;
        }
        
        int[] array = new int[arr.length];

        for (int i=0; i<arr.length; i++)
        {
            array[i] = arr[i];
        }    

        Arrays.sort(array);

        HashMap<Integer, Integer> map = new HashMap<>();

        int c = 1;

        map.put(array[0], 1);

        for (int i=1; i<array.length; i++)
        {
            if (array[i] > array[i-1])
            {
                c++;
                map.put(array[i], c);
            }
            else
            {
                map.put(array[i], c);
            }
        }

        for (int i=0; i<arr.length; i++)
        {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}