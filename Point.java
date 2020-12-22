public class Point
{

private int x;
private int y;



public Point()
{
this.x=0;
this.y=0;
}

public Point(int x, int y) 
{
this.x = x;
this.y = y;
}

 public int getX()
{
return this.x;
}

public int getY()
{
return this.y;
}

 public void setPoint(int  x, int y)
{
this.x=x;
this.y=y;
}


 public String toString() 
{
return "(" + x + ", " + y + ")";
}

 public double distance(Point that ) 
 {
double xx = this.x - that.x;
double yy = this.y - that.y;
return Math.sqrt(xx*xx + yy*yy);
 }






































}