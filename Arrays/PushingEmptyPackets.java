/*A chocolate factory is packing chocolates into the packets. The chocolate packets here represent an array  of N number of integer values. The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).

Example 1 :

N=8 and arr = [4,5,0,1,9,0,5,0].

There are 3 empty packets in the given set. These 3 empty packets represented as O should be pushed towards the end of the array
*/


public class PushingEmptyPackets 
{
	public static void main(String[] args)
	{
		int[] array = {4,5,0,1,9,0,5,0};
		PushingEmptyPackets obj = new PushingEmptyPackets();
		
		int[] ans = obj.pushing(array);
		
		for(int i=0; i<array.length; i++)
		{
			System.out.println("Array: " + ans[i]);
		}
	}
    
	public int[] pushing(int[] arr)
	{
		int temp=0;
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]!=0)
			{
				arr[temp]=arr[i];
				temp++;
			}
		}
		for (int j=temp; j<arr.length; j++)
		{
			arr[j]=0;
		}
		
		return arr;
	}
}