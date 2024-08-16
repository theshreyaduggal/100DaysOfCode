import java.util.ArrayList;
import java.util.HashMap;

public class RemovingDuplicates 
{
	public static ArrayList<Integer> removeDuplicates(int[] a)
	{
		ArrayList<Integer> output = new ArrayList<Integer>();
		HashMap<Integer, Boolean> seen = new HashMap<>();
		for (int i=0; i<a.length; i++)
		{
			if (seen.containsKey(a[i]))
			{
				continue;
			}
			output.add(a[i]);
			seen.put(a[i],true);
		}
		return output;
	}
	public static void main(String[] args)
	{
		int[] a = {1,3,2,4,1,2,5,3,6};
		ArrayList<Integer> result = removeDuplicates(a);
		for (int i=0; i<result.size(); i++)
		{
			System.out.println(result.get(i));
		}
	}
}
