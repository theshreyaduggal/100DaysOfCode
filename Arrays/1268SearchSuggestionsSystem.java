class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) 
    {
        Arrays.sort (products);
        int start = 0;
        int end = products.length-1;

        List<List<String>> list = new ArrayList<>();

        for (int i=0; i<searchWord.length(); i++) 
        {
            while (start<=end && (i>=products[start].length() || products[start].charAt(i) != searchWord.charAt(i))) 
            {
                start++;
            }

            while (start<=end && (i>=products[end].length() || products[end].charAt(i) != searchWord.charAt(i))) 
            {
                end--;
            }

            List<String> list1 = new ArrayList<>();

            for (int j= start; j<=Math.min(end, start + 2); j++) 
            {
                list1.add(products[j]);
            }

            list.add(list1);
        }
        return list;   
    }
}