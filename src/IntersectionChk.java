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
		
		//x coordinates
		int x1, x2 ;
		//y coordinates
		int y1, y2 ;
		//slopes 
		int m1 ,m2 ;
		
		//get input
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter (x1,y1) for line 1: ");
		x1 = input.nextInt() ;
		y1 = input.nextInt() ;
		
		System.out.print("Please enter (x2,y2) for line 1: ");
		x2 = input.nextInt() ;
		y2 = input.nextInt() ;
		
		//calculate slope
		// correct division by zero
		m1 = (y2-y1)/(x2-x1);
		
		System.out.println(m1);
		
		System.out.print("Please enter (x1,y1) for line 2: ");
		x1 = input.nextInt() ;
		y1 = input.nextInt() ;
		
		System.out.print("Please enter (x2,y2) for line 2: ");
		x2 = input.nextInt() ;
		y2 = input.nextInt() ;
		
		//calculate slope
		// correct division by zero
		m2 = (y2-y1)/(x2-x1);
		
		System.out.println(m2);
		
		
		input.close();

	}

}
