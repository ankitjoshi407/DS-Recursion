/*
Q1. Take as input N, the size of array. Take N more inputs and store that in an array. Take as input M, a number. Write a recursive function which returns true if M is contained in the array and false otherwise. Print the value returned.
*/

import java.util.Scanner;
class array
{
	private int arr[],size;
	
	array(int size)
	{
		this.size = size;
		arr = new int[size];
	}
	
	public void insertVals(Scanner sc)
	{
		System.out.println("Start entering the elements of array:-");
		for(int i=0;i<size;i++)
			arr[i] = sc.nextInt();
	}
	
	public void displayArray()
	{
		System.out.println("The elements of array:-");
		for(int i=0;i<size;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public boolean search(int index,int value)
	{
		// System.out.println("** Visiting index = " + index);
		if(index == size)
			return false;
		else if(arr[index] == value)
			return true;
		else
			return search(++index,value);
	}
}
class availability{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the size of array : ");
		int N = sc.nextInt();
		if(N > 0)
		{
			array a = new array(N);
			a.insertVals(sc);
			a.displayArray();
			System.out.print("\nEnter a number to search : ");
			int M = sc.nextInt();
			System.out.println("Number found in array : " + a.search(0,M));
		}
		System.out.println();
		sc.close();
	}
}