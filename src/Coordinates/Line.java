package Coordinates ;
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


//lines behavior
	public Line(int x1, int y1, int x2, int y2)
	{
		point1 = new Point(x1,y1);
		point2 = new Point(x2,y2);
				
	}

	//calculate slope
	public double calcSlope()
	{
		//fix slope division by zero
		slope = (double)((point2.getY() - point1.getY())/
				(point2.getX() - point1.getX()) == 0 ? (point2.getX() - point1.getX()) : 1 ) ;
		
		return this.slope;
		
	}
	//calculate y intercept
	public double yIntercept()
	{
		
		y_axis_int = (point1.getY() - (slope * point1.getX()));
		
		return y_axis_int ;
	}
	//calculate x intercept
	public double xIntercept()
	{
		if(slope != 0)
		{
			return point1.getY() - y_axis_int / slope ;
						
		}
		return 0 ;
	}
	//calculate length
	public double lineLength()
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
		
		return true ;
	}

}
