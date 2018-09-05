/*
Q5. Check if a number N is a palindrome or not.
*/

class Palindrome
{
	private int num,rev;
	
	Palindrome()
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
	public void checkPalindrome()
	{
		if(num == rev)
			System.out.println(num + " is a Palindrome");
		else
			System.out.println(num + " is not a Palindrome");
	}
}
class q5
{
	public static void main(String[] y)
	{
		Palindrome obj1 = new Palindrome();
		Palindrome obj2 = new Palindrome();
		
		obj1.setValues(12321);
		obj2.setValues(12354);
		
		obj1.calRev();
		obj1.checkPalindrome();
		
		obj2.calRev();
		obj2.checkPalindrome();
		
		System.out.println();
	}
}
