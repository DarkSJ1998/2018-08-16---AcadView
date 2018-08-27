class greatest
{
	private int a,b,c;
	
	public void setVals(int a,int b,int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void checkGreatest()
	{
		System.out.println("a = " + a + "\nb = " + b + "\nc = " + c);
		
		if(a != b && b != c && a != c)
		{
			System.out.print("Maximum number is ");
			if(a > b)
			{
				if(a > c)
					System.out.println(a);
				else
					System.out.println(c);
			}
			else
			{
				if(b > c)
					System.out.println(b);
				else
					System.out.println(c);
			}
		}
		else if(a == b && b == c)
			System.out.println("All 3 numbers are equal, ie, a = b = c = " + a);
		else if(a == b)
		{
			System.out.println("a = b = " + a);
			System.out.print("Maximum number is ");
			if(a > c)
				System.out.println(a);
			else
				System.out.println(c);
		}
		else if(b == c)
		{
			System.out.println("b = c = " + b);
			System.out.print("Maximum number is ");
			if(b > a)
				System.out.println(b);
			else
				System.out.println(a);
		}
		else
		{
			System.out.println("a = c = " + a);
			System.out.print("Maximum number is ");
			if(a > b)
				System.out.println(a);
			else
				System.out.println(b);
		}
		
		System.out.println();
	}
}
class q4
{
	public static void main(String[] x)
	{
		greatest obj1 = new greatest();
		greatest obj2 = new greatest();
		greatest obj3 = new greatest();
		
		obj1.setVals(5,10,15);
		obj2.setVals(15,10,15);
		obj3.setVals(15,15,15);
		
		obj1.checkGreatest();
		obj2.checkGreatest();
		obj3.checkGreatest();
	}
}