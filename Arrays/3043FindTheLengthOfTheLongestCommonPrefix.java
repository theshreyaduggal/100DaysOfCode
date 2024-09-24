class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) 
    {
        HashSet<Integer> set = new HashSet<>();

	    for(int val : arr1)
        {
		    String str = val + "";
		
		    for(int i=0; i<str.length(); i++)
            {
			    int sub = Integer.parseInt(str.substring(0, i+1));
			    set.add(sub);
		    }
	    }

	    int length = 0;
	
        for(int val : arr2)
        {
		    String str = val + "";

		    for(int i=length; i<str.length(); i++)
            {
			    int sub = Integer.parseInt(str.substring(0, i+1));
			
                if(set.contains(sub))
                {
				    length = i+1;
			    }
		    }
        }

	    return length;    
    }
}