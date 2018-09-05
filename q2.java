/*
Q2.Check if a given year is a leap year or not.
*/

class year
{
	private int year;
	
	public void setYear(int year)
	{
		this.year = year;
	}
	public int getYear()
	{
		return year;
	}
	public void check()
	{
		if((year%4 == 0 && year%100 != 0) || (year%400 == 0))
			System.out.println("Yes " + getYear() + " is a Leap Year.");
		else
			System.out.println("No " + getYear() + " is not a Leap Year.");
	}
}
class q2
{
	public static void main(String[] y)
	{
		year obj = new year();
		obj.setYear(1998);
		obj.check();
		System.out.println();
	}
}
