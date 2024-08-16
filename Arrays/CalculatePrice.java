/*A supermarket maintains a pricing format for all its products. A value N is printed on each product. When the scanner reads the value N on the item, the product of all the digits in the value N is the price of the item. The task here is to design the software such that given the code of any item N the product (multiplication) of all the digits of value should be computed(price).

Example 1:

Input :
5244 -> Value of N

Output :
160 -> Price 

Explanation:

From the input above 
Product of the digits 5,2,4,4
5*2*4*4= 160
Hence, output is 160.
*/


public class CalculatePrice {

	public static void main(String[] args) 
	{
		int value = 5244;
		CalculatePrice obj = new CalculatePrice();
		int ans = obj.calcCost(value);
		
		System.out.println("Price: " +ans);
	}
	
	public int calcCost(int value)
	{
		int product=1;
		for(; value>0; value=value/10)
		{
			int rem = value%10;
			product=product*rem;
		}
		
		return product;
	}
}


