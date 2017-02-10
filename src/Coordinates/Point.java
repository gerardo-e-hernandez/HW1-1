package Coordinates ;
	public class Point {
		
		private int x ;
		private int y ;
		
		public Point(int xCoord, int yCoord)
		{
			x = xCoord ;
			y = yCoord ;
			
		}
		
		public int getX() { return x ;}
		
		public int getY(){ return y ; }
		
		public int getQuadrant()
		{
			if(x >= 0)
			{
				if(y > 0)
				{
					return 1 ;
				}
				
				return 4;
			}
			else if(x <= 0)
			{
				if(y<0)
				{
					return 3 ;
				}
				return 2 ;
								
			}
			else if(x == 0 & y == 0)
			{
				return 0 ;
				
			}
			
			return 0 ;
			
			
		}
				
	
	}
