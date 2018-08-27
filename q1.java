class sum
{
	private int a,b,sum;
	
	public void setValues(int a,int b)
	{
		this.a = a;
		this.b = b;
	}
	public void calSum()
	{
		sum = a+b;
	}
	public void display()
	{
		System.out.println("a = " + a + " b = " + b);
		System.out.println("Sum = " + sum);
	}
}
class q1
{
	public static void main(String[] y)
	{
		sum obj = new sum();
		obj.setValues(10,15);
		obj.calSum();
		obj.display();
		System.out.println();
	}
}