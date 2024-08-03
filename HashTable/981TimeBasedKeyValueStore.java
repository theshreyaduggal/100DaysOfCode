class TimeMap 
{
    HashMap<String, List<Data>> map;

    public TimeMap() 
    {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) 
    {
        if (!map.containsKey(key)) 
        {
            map.put(key, new ArrayList<Data>());
        }

        map.get(key).add(new Data(value,timestamp));
    }
    
    public String get(String key, int timestamp) 
    {
        if(!map.containsKey(key))
        {
            return "";
        }
        return binarySearch(map.get(key),timestamp);
    }

    public String binarySearch(List<Data> list, int timestamp)
    {
        int low = 0;
        int high = list.size()-1;

        while(low < high)
        {
            int mid = low + (high-low)/2;

            if(list.get(mid).timestamp == timestamp)
            {
                return list.get(mid).value;
            }
            if(list.get(mid).timestamp < timestamp)
            {
                if(list.get(mid+1).timestamp > timestamp)
                {
                    return list.get(mid).value;
                }
                low = mid+1;
            }
            else 
            {
                high = mid-1;
            }
        }

        if (list.get(low).timestamp <= timestamp)
        {
            return list.get(low).value;
        }

        return "";
    }
}

class Data
{
    String value;
    int timestamp;

    Data(String value, int timestamp)
    {
        this.value = value;
        this.timestamp = timestamp;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */