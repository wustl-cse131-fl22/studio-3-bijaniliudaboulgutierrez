package studio3;

import java.util.Scanner;
import java.lang.Math;

public class Sieve {
	public static void main(String [] args)
	{
		
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Up to what number do you want to find prime numbers?");
	int n = in.nextInt();
	
	double nNotExceed = Math.sqrt(n);
	
	boolean [] values = new boolean[n];
	
	for(int i = 2; i < values.length; i++)
	{
		values[i] = true;
	}
	
	for(int j = 2; j < nNotExceed; j++)
	{
		if (values[j] == true)
		{
			for(int k = j*j; k < n; k+=j)
			{
				values[k] = false;
			}
			
		}
	}
	for (int i = 2; i < values.length; i++)
	{
		if(values[i])
		{
			System.out.println("These are prime numbers: " + i);
		}
	}
	
	
	
	
	

}}
