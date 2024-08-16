/*An intelligence agency has received reports about some threats. The reports consist of numbers in a mysterious method. There is a number “N” and another number “R”. Those numbers are studied thoroughly and it is concluded that all digits of the number ‘N’ are summed up and this action is performed ‘R’ number of times. The resultant is also a single digit that is yet to be deciphered. The task here is to find the single-digit sum of the given number ‘N’ by repeating the action ‘R’ number of times.
If the value of ‘R’ is 0, print the output as ‘0’.

Example 1:

Input :
99 -> Value of N
3  -> Value of R

Output :
9  -> Possible ways to fill the cistern.

Explanation:

Here, the number N=99
Sum of the digits N: 9+9 = 18
Repeat step 2 ‘R’ times i.e. 3 tims  (9+9)+(9+9)+(9+9) = 18+18+18 =54
Add digits of 54 as we need a single digit 5+4
Hence , the output is 9.
*/


public class RepeatingAction {

	public static void main(String[] args) 
	{
		int n=1234;
		int r=2;
		RepeatingAction obj = new RepeatingAction();
		int output = obj.calc(n,r);
		
		System.out.println(output);
	}

	public int calc(int n, int r)
	{
		int sumdig=0;
		for (int i=0; i<r; i++)
		{
			sumdig = sumdig+sumOfDigits(n);
		}
		
		int ans = sumOfDigits(sumdig);
		return ans;
	}
	
	public int sumOfDigits(int num)
	{
		int sum=0;
		for(; num>0; num=num/10)
		{
			int rem = num%10;
			sum=sum+rem;
		}
		
		return sum;
	}
}
