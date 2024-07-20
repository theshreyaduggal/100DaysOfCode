class Solution {
    public boolean uniqueOccurrences(int[] arr) 
    {
        HashMap<Integer,Integer> numbers = new HashMap<>();
		
		for (int i=0; i<arr.length; i++)
		{
			if(numbers.containsKey(arr[i]))
			{
			  numbers.put(arr[i],numbers.get(arr[i])+1);
			}
            else
			{
				numbers.put(arr[i],1);
			}
		}  

        Set<Integer> set = new HashSet<>();
        for (int num : numbers.values())
        {
            set.add(num);
        }
        
        return numbers.size() == set.size();
    }
}