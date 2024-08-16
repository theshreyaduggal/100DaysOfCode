/*The Binary number system only uses two digits, 0 and 1 and number system can be called binary string. You are required to implement a function \
which accepts a string str as its argument. The string str consists of binary digits separated with an alphabet as follows:

– A denotes AND operation
– B denotes OR operation
– C denotes XOR Operation

You are required to calculate the result of the string str, scanning the string to right taking one opearation at a time, and return the same.

Note:

No order of priorities of operations is required
Length of str is odd
If str is NULL, return -1

Input:
str: 1C0C1C1A0B1

Output:
1

Explanation: 
The alphabets in str when expanded becomes “1 XOR 0 XOR 1 XOR 1 AND 0 OR 1”, result of the expression becomes 1, hence 1 is returned.
*/


public class BinaryString 
{
	public static int operationsBinaryString(String str)
	{
		int num = Integer.parseInt(String.valueOf(str.charAt(0)));
		
		char[] ch = str.toCharArray();
		
		for (int i=1; i<ch.length; i++)
		{
			if (ch[i] == 'A')
			{
				num = num & Integer.parseInt(String.valueOf(ch[i+1]));
			}
			else if (ch[i] == 'B')
			{
				num = num | Integer.parseInt(String.valueOf(ch[i+1]));
			}
			else if (ch[i] == 'C')
			{
				num = num ^ Integer.parseInt(String.valueOf(ch[i+1]));
			}
		}
		return num;
	}
	
	public static void main(String[] args)
	{
		String str = "0C1A1B1C1C1B0A0";
		
		System.out.println(operationsBinaryString(str));
	}
}
