/*
Q4. Write a recursive function to calculate x^y. Take x and y as input from the user.
For example, 2^4 = 16.
*/

import java.util.Scanner;
class Power
{
	private int count=1;
	
	public int findPower(int x,int y)
	{
		if(count == y)
			return x;
		else if(y == 0)
			return 1;
		else
		{
			count++;
			return x*findPower(x,y);
		}
	}
}
class powerno
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Power num = new Power();
		System.out.print("\nEnter x : ");
		int x = sc.nextInt();
		System.out.print("\nEnter y : ");
		int y = sc.nextInt();
		System.out.println("\nx^y = " + num.findPower(x,y));
		sc.close();
	}
}