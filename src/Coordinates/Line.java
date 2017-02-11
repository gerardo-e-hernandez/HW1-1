package Coordinates ;

class Point {
	
	private int x ;
	private int y ;
	
	public Point(int xCoord, int yCoord)
	{
		x = xCoord ;
		y = yCoord ;
		
	}
	
	public int getX() { return x ;}
	
	public int getY(){ return y ; }
	
}

public class Line {
	
	//line lower end-point
	Point point1 ;
	//line upper end-point
	Point point2;
	//line slope
	double slope = 0;
	//line y axis intersection point
	double y_axis_int = 0 ;
	//line x axis intersection point
	double x_axis_int = 0 ;
	//line length
	double len = 0;
	//rightmost point
	int rBound ;
	//leftmost point
	int lBound ;


//lines behavior
	//line constructor
	public Line(int x1, int y1, int x2, int y2)
	{
		point1 = new Point(x1,y1);
		point2 = new Point(x2,y2);
		slope = calcSlope() ;
		y_axis_int = yIntercept();
		x_axis_int = xIntercept() ;
		len = lineLength();
		rBound = (this.point1.getX() >= this.point2.getX() ? this.point1.getX() : this.point2.getX());
		lBound = (this.point1.getX() <= this.point2.getX() ? this.point1.getX() : this.point2.getX());
				
	}
	
	//add new line
	public void newLine(int x1, int y1, int x2, int y2)
	{
		point1 = new Point(x1,y1);
		point2 = new Point(x2,y2);
		
	}

	//return line coordinates
	public int[] points()
	{
		int[] pts ={point1.getX(),point1.getY(),point2.getX(),point2.getY()} ;
		return pts ;
		
	}
	//calculate slope
	private double calcSlope()
	{
		//fix slope division by zero
		if((point2.getX() - point1.getX())!= 0){
			
				this.slope = (double)((point2.getY() - point1.getY())/
				(point2.getX() - point1.getX()));
		}
		else
		{
			this.slope = 0 ;
		}
		return this.slope;
		
	}
	//calculate y intercept
	private double yIntercept()
	{
		if(point1.getY() == point2.getY())
		{
			return point1.getY() ;
		}
		return (point1.getY() - (slope * point1.getX()));
		
	}
	//calculate x intercept
	private double xIntercept()
	{
		if(slope != 0)
		{
			return (point1.getY() - y_axis_int / slope) ;
				
		}
		else if(point1.getX() == point2.getX())
		{
			return point1.getX() ;
			
		}
		return 0 ;
	}
	//calculate length
	private double lineLength()
	{
		//work on calculating length
		int a = Math.abs(point1.getX()-point2.getX()); 
		int b = Math.abs(point1.getY()-point2.getY());
		len = Math.sqrt((a*a)+(b*b));
		return len ;
	}
	//does line intersect another line
	public boolean doIntersect(Line iLine)
	{
		int rightmost = (this.rBound >= iLine.rBound ? this.rBound : iLine.rBound);
		int leftmost = (this.lBound <= iLine.lBound ? this.lBound : iLine.lBound);
		

		//lines do not intersect
		
		//lines are parallel
		if(this.slope == iLine.slope)
		{
			//lines are overlapping
			if(this.slope == 0 && iLine.slope == 0 )
			{
				if(this.xIntercept() == iLine.xIntercept())
				{
					if(this.xIntercept() > leftmost && this.xIntercept() < rightmost)
					return true ;
				}
				
			}
			else if(this.yIntercept() == iLine.yIntercept())
			{
				return false ;
			}
			else if(this.xIntercept() == iLine.xIntercept())
			{
				return false ;
			}
			else
			{
			return false ;
			}
			
		}
		else if(this.slope != iLine.slope)
		{
			//lines do not cross because the are too short
			if(this.xIntercept() == iLine.xIntercept())
			{
				if(this.xIntercept() > leftmost && this.xIntercept() < rightmost)
				return true ;
			}
			
			return false ;
			//lines intersect
		}
	return true ;

	}

}


