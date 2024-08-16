/*A function accepts string str of size n as an argument. Implement the function which returns 1 if given string str is valid password else 0.
str is a valid password if it satisfies the below conditions.

– At least 4 characters
– At least one numeric digit
– At Least one Capital Letter
– Must not have space or slash (/)
– Starting character must not be a number
Assumption:
Input string will not be empty.

Example:

Input:
aA1_67

Output:
1
*/


public class PasswordChecker 
{
	public static int checkPassword(String str)
	{
		if (str.length() < 4)
		{
			return 0;
		}
		
		if (str.charAt(0) >='0' && str.charAt(0) <= '9')
		{
			return 0;
		}
		
		int num = 0;
		int letter = 0;
		
		for (char ch : str.toCharArray())
		{
			if (ch == ' ' || ch == '/')
			{
				return 0;
			}
			if (ch >= 'A' && ch <= 'Z')
			{
				letter++;
			}
			else if (ch >= '0' && ch <='9')
			{
				num++;
			}
		}
		
		if (num >=1 && letter >= 1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	public static void main(String[] args)
	{
		String str = "a987 abC012";
		
		System.out.println(checkPassword(str));
	}
}
