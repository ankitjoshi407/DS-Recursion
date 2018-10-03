/*
Q6.* Take as input str, a string. Write a recursive function which returns a new string in which all duplicate consecutive characters are reduced to a single char. 
E.g. for hello return helo. Print the value returned.
*/

import java.util.Scanner;
class UniqueString
{
	private String newStr = "";
	
	public String findUniqueString(String str,int i,int len)
	{
		if(i == len || len == 0)
			return newStr;
		else if(i == 0)
			newStr += str.charAt(i);
		else if(str.charAt(i) != str.charAt(i-1))
		{
			newStr += str.charAt(i);
		}
		// System.out.println("newStr = " + newStr);
		return findUniqueString(str,++i,len);
	}
}
class stringunique
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		UniqueString s = new UniqueString();
		System.out.print("\nEnter a string : ");
		String str = sc.nextLine();
		int len = str.length();
		System.out.println("\nThe unique string = " + s.findUniqueString(str,0,len));
		sc.close();
	}
}