/*Given an integer array Arr of size N the task is to find the count of elements whose value is greater than all of its prior elements.
Note : 1st element of the array should be considered in the count of the result.

For example,

Arr[]={7,4,8,2,9}

As 7 is the first element, it will consider in the result.
8 and 9 are also the elements that are greater than all of its previous elements.
Since total of  3 elements is present in the array that meets the condition.
Hence the output = 3.
*/


public class CountingElements {

	public static void main(String[] args) 
	{
		int[] array = {3,4,5,8,9};
		CountingElements obj = new CountingElements();
		int output = obj.counting(array);
		
		System.out.println(output);
	}
	
	public int counting(int[] array)
	{
		int count=1;
		for (int index=array.length-1; index>0; index--)
		{
			int number = index-1;
			
			while(array[index]>array[number])
			{
				if (number==0)
				{
					count++;
				}
				
				number--;
				
				if(number==-1)
				{
					break;
				}
			}
		}
		return count;
	}
}
