class Solution {
    public String destCity(List<List<String>> paths) 
    {
        HashMap<String, String> map = new HashMap<>();
        for (int i=0; i<paths.size(); i++)
        {
            map.put(paths.get(i).get(0), paths.get(i).get(1));
        }    
       
        String city = paths.get(0).get(1);
        
        while(map.containsKey(city))
        {
            city = map.get(city);
        }

        return city;
    }
}