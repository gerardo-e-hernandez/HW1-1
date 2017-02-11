import Coordinates.Line ;
import java.util.Scanner ;
public class intersection {

	public static void main(String[] args) {
				
		Scanner input = new Scanner(System.in);
		int[] pts  = new int[8] ;
		char loop = 'n' ;
		
		do{
			//get lines input from user
			System.out.println("Input:");
			for(int i = 0 ; i < pts.length ; i++)
			{
				pts[i] = input.nextInt() ;
				
			}
			
			Line line1 = new Line(pts[0],pts[1],pts[2],pts[3]);
			Line line2 = new Line(pts[4],pts[5],pts[6],pts[7]);
			
			//if lines intersect
			if(line1.doIntersect(line2))
			{
				System.out.println("1");
				
			}
			//if lines do not intersect
			else
			{
				
				System.out.println("0");
			}
			
			
	
			
			//prompt for exit
			System.out.println("Do you wish to continue? ");
			loop = input.next().charAt(0);
			

		
		}while(loop != 'n');
		
		System.out.println("Thank you");
		input.close();
				
		
	}
	

}
