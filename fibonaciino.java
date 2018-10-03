/*
Q3. Write a recursive function to calculate the Nth fibonacci number.
*/

import java.util.Scanner;
class Fibonacci
{
	private int count=1;
	
	public int nThNumber(int a,int b,final int N)
	{
		System.out.print(a + " ");
		if(count == N)
			return a;
		else
		{
			int c = a+b;
			a = b;
			b = c;
			count++;
			return nThNumber(a,b,N);
		}
	}
}
class fibonaccino
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Fibonacci num = new Fibonacci();
		System.out.print("\nEnter n : ");
		int N = sc.nextInt();
		if(N > 0)
			System.out.println("\nThe Fibonacci number at pos : " + N + " is = " + num.nThNumber(0,1,N));
		sc.close();
	}
}