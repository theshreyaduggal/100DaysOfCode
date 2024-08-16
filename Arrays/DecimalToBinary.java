/*Joseph is learning digital logic subject which will be for his next semester. He usually tries to solve unit assignment problems before the lecture. Today he got one tricky question. The problem statement is “A positive integer has been given as an input. Convert decimal value to binary representation. Toggle all bits of it after the most significant bit including the most significant bit. Print the positive integer value after toggling all bits”.

Constrains-

1<=N<=100

Example:

Input :
10  -> Integer

Output :
5    -> result- Integer

Explanation:

Binary representation of 10 is 1010. After toggling the bits(1010), will get 0101 which represents “5”. Hence output will print “5”.
*/


public class DecimalToBinary 
{
	public static void main(String[] args)
	{
		int decimal = 10;
		DecimalToBinary obj = new DecimalToBinary();
		int output = obj.conversion(decimal);
		System.out.println(output);
	}
	
	public int conversion(int decimal)
	{
		String binary = Integer.toBinaryString(decimal);
		
		String first = binary.replace("0","2");
		String second = first.replace("1","0");
		String third = second.replace("2","1");
		
		int ans = Integer.parseInt(third,2);

		return ans;
	}
}
