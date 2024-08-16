/*Jack is always excited about sunday. It is favourite day, when he gets to play all day. And goes to cycling with his friends. 
So every time when the months starts he counts the number of sundays he will get to enjoy. Considering the month can start with any day, be it Sunday, Monday…. Or so on.
Count the number of Sunday jack will get within n number of days.

Example:

Input 
mon-> input String denoting the start of the month.
13  -> input integer denoting the number of days from the start of the month.

Output :
2    -> number of days within 13 days.

Explanation:
The month start with mon(Monday). So the upcoming sunday will arrive in next 6 days. And then next Sunday in next 7 days and so on.
Now total number of days are 13. It means 6 days to first sunday and then remaining 7 days will end up in another sunday. Total 2 sundays may fall within 13 days.
*/


public class CountingSundays 
{
	public static void main(String[] args)
	{
		String[] week = {"Mon","Tue","Wed","Thurs","Fri","Sat","Sun"};
		String dayName= "Wed";
		int daysNo = 3;
		CountingSundays obj = new CountingSundays();
		int sun = obj.countDays(week, dayName, daysNo);
		
		System.out.println("Sundays: " + sun);
	}
	
	public int countDays(String[] week, String dayName, int daysNo)
	{
		int position=0;
		for (int index=0; index<7; index++)
		{
			if(dayName==week[index])
			{
				position = index+1;
			}
		}
		
		int sunday=0;
		int remainingWeek = 7-position;
		daysNo = daysNo - remainingWeek;
		
		if (daysNo>0)
		{
			sunday=1;
			sunday = sunday+(daysNo/7);
		}
		return sunday;
	}
}
