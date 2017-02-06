/**
 * Gerardo Hernandez
 * SID# 20217586
 * HW1-1
 * January 30, 2017
 *
 */

import java.util.Scanner;


public class IntersectionChk {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] coords = new int[8] ; // 0:=x1 1:=y1 2:=x2 3:=y2
		double[] slopes ;
		double[] yInt;
		
		char again = 'y';
		
		while(again == 'y' || again == 'Y')
		{
			System.out.print("Input: ");
			
			for(int i = 0 ; i < coords.length ; i++)
			{
				coords[i] = input.nextInt();
				
			}
			
			//calculate slopes
			slopes = calcSlope(coords);
			//calculate y-intercepts
			yInt = calcYInt(coords, slopes);
			
			if(slopes[0] == slopes[1])
			{
				if(yInt[0] == yInt[1])
				{
					System.out.println("1");
										
				}
				else
				{
					System.out.println("0");
										
				}
			}
			else if(slopes[0] != slopes[1])
			{
				
				
			}
				
			System.out.print("Do you want to test again? ");
			again = input.next().charAt(0);
			if(again != 'y' || again != 'Y')
			{
				System.out.println("Thank you");
			}
			
					
		}
		
		input.close();
	}
	
	//calculate slope of the give points
	private static double[] calcSlope(int[] input)
	{
		
		double[] m  = new double[input.length /4] ;
		
		for(int i = 0 ; i < input.length ; i+=4)
		{
			m[i%4] = ((input[i+3]-input[i+1])/(input[i+2]-input[i]));	
		}
		
		return m ;
		
	}
	
	//calculate the b component from y = mx + b
	private static double[] calcYInt(int[] coords, double[] slopes)
	{
		double[] intercepts = new double[2];
		
		intercepts[0] = coords[1] - slopes[0]*coords[0] ;
		intercepts[1] = coords[5] - slopes[1]*coords[4] ;
		
		return intercepts ;
	}

}
