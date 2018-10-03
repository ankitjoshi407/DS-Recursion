/*
Q7.* Take as input str, a string. The string is a mathematical expression e.g. [a + {b +(c + d) + e} + f]. Write a recursive function which tests if the brackets in expression are balanced or not and returns a Boolean value. Print the value returned.
*/

import java.util.Scanner;
class BalancedBrackets
{
	private char brackets[];
	private int index;
	
	BalancedBrackets(String str)
	{
		brackets = new char[str.length()];
		index = -1;
	}
	
	public boolean checkBalancedBrackets(String str,int i,int len)
	{
		// display();
		if((i == len && index == -1) || len == 0)
			return true;
		else if(i == len && index > -1)
			return false;
		else
		{
			char ch = str.charAt(i);
			// System.out.println("// ch = " + ch);
			//if(index > -1)
			//{
				if(index > -1 && ch == ']' && brackets[index] == '[')
				{
					brackets[index] = ' ';
					index--;
				}
				else if(index > -1 && ch == '}' && brackets[index] == '{')
				{
					brackets[index] = ' ';
					index--;
				}
				else if(index > -1 && ch == ')' && brackets[index] == '(')
				{
					brackets[index] = ' ';
					index--;
				}
			//}
			else if(ch=='[' || ch=='{' || ch=='(' || ch==']' || ch=='}' || ch==')')
			{
				index++;
				// System.out.println("// brackets[" + index + "] = " + str.charAt(i));
				brackets[index] = str.charAt(i);
			}
			// System.out.println("newStr = " + newStr);
			return checkBalancedBrackets(str,++i,len);
		}
	}
	
	// private void display()
	// {
		// if(index != -1)
		// {
			// System.out.print("** brackets[] = ");
			// for(int i=0;i<=index;i++)
				// System.out.print(brackets[i] + " ");
			// System.out.println();
		// }
	// }
}
class bracketno
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter an expression : ");
		String str = sc.nextLine();
		BalancedBrackets s = new BalancedBrackets(str);
		
		int len = str.length();
		System.out.println("\nBalanced Brackets = " + s.checkBalancedBrackets(str,0,len));
		sc.close();
	}
}