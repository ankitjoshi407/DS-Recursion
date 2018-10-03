/*
Q5.* Take as input str, a number in form of a string. Write a recursive function to find the sum of digits in the string. Print the value returned.
*/

import java.util.Scanner;
class Sum
{
	public int findSum(String str,int i,int len)
	{
		if(i == len || len == 0)
			return 0;
		else if(!(str.charAt(i) >= '0' && str.charAt(i) <= '9'))
		{
			System.out.println("NaN");
			return 0;
		}
		else
			return Integer.parseInt(""+str.charAt(i)) + findSum(str,++i,len);
	}
}
class sumof
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Sum s = new Sum();
		System.out.print("\nEnter number : ");
		String str = sc.next();
		int len = str.length();
		System.out.println("\nThe sum of digits = " + s.findSum(str,0,len));
		sc.close();
	}
}