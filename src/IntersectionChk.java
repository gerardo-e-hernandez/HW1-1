/**
 * Gerardo Hernandez
 * HW1-1
 * Due Date 02/07/2017
 *
 */

import java.util.Scanner;


public class IntersectionChk {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[][] coords = new int[4][2] ; 
		double[] m ;
		double[] b;
		
		char again = 'y';
		
		while(again == 'y' || again == 'Y')
		{
			System.out.print("Input: ");
			
			for(int i = 0 ; i < coords.length ; i++)
			{
				for(int j = 0 ; j < 2 ; j++)
				{
					coords[i][j] = input.nextInt();
				}
			}
			
			
			//calculate slopes
			m = calcSlope(coords);
			//calculate y-intercepts
			b = calcB(coords, m);


			//if slopes are the same
			if(m[0] == m[1])
			{
				//then lines never touch 
				//if y intercepts are not the same
				if(b[0] != b[1])
				{
					//Print a zero if lines never touch
					System.out.println("0");
					
				}
				else if(b[0] == b[1])//if lines never touch
				{
					//but y intercept is the same 
					System.out.println("1");
										
				}
				
			}
			else if(m[0] != m[1])
			{
				//then line should intercept			
				System.out.println("1");
							
			}
				
			System.out.print("Do you want to test again? ");
			again = input.next().charAt(0);
			
			if(again == 'n' || again == 'N')
			{
				System.out.println("Thank you");
			}
			
					
		}
		
		input.close();
	}
	
	//calculate slope of the give points
	private static double[] calcSlope(int[][] input)
	{
		
		double[] m  = new double[2] ;

		m[0] = ((input[1][1]-input[0][1])/(input[1][0]-input[0][0]));	
		m[1] = ((input[3][1]-input[2][1])/(input[3][0]-input[2][0]));	
		
		return m ;
		
	}
	
	//calculate the b component from y = mx + b
	private static double[] calcB(int[][] coords, double[] slopes)
	{
		double[] intercepts = new double[2];
		
		intercepts[0] = coords[1][0] - slopes[0]*coords[0][0] ;
		intercepts[1] = coords[2][1] - slopes[1]*coords[2][0] ;
		
		return intercepts ;
	}
	

}
