class Reverse
{
	private int num,rev;
	
	Reverse()
	{
		num = rev = 0;
	}
	
	public void setValues(int num)
	{
		this.num = num;		
	}
	
	public void calRev()
	{
		int digits = 0,temp = num;
		while(temp > 0)
		{
			rev = rev*10 + temp%10;
			temp /= 10;
		}
		System.out.println("\nNumber : " + num);
		System.out.println("Reverse : " + rev);
	}
}
class q7
{
	public static void main(String[] y)
	{
		Reverse obj1 = new Reverse();
		Reverse obj2 = new Reverse();
		
		obj1.setValues(123);
		obj2.setValues(12354);
		
		obj1.calRev();
		
		obj2.calRev();
		
		System.out.println();
	}
}