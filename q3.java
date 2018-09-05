/*
Q3.Print the pattern:
*
**
***
****
*/

class q3
{
	public static void main(String[] y)
	{
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}
	}
}
