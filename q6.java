/*
Q6. Check if a number N is prime or not.
*/

class Prime
{
	private int num;
	
	public void setValues(int num)
	{
		this.num = num;		
	}
	
	public void checkPrime()
	{
		int factors = 0;
		if(num == 1)
			factors = -1;
		
		for(int i=2;i<=Math.sqrt(num);i++)
		{
			if(num%i == 0)
				factors++;
		}
		if(factors == 0)
			System.out.println(num + " is a Prime number");
		else
			System.out.println(num + " is not a Prime number");
	}
}
class q6
{
	public static void main(String[] y)
	{
		Prime obj1 = new Prime();
		Prime obj2 = new Prime();
		
		obj1.setValues(20);
		obj2.setValues(19);
		
		obj1.checkPrime();
		
		obj2.checkPrime();
		
		System.out.println();
	}
}
