
/*3. Solve
Create Point class Point2D   : for representing a point in x-y co-ordinate system.
3.1 Create a parameterized constructor to accept x & y co-ords.
3.2 Add public String getDetails()) --to return string form point's x & y co-ords
3.3 Add isEqual method to Point2D class : boolean returning method :
 must return true if both points are having same x,y co-ords or false otherwise. 
3.4 Add a method to Point2D class -- to create and return new point having given
 x & y offset.
eg : Point2D p1=new Point2D(10,20);
Point2d p3=p1.createNewPoint(5,-2);//p3 : 15,18
If user supplies offset of (5, -2) : your method should return a new point
 object placed at (15,18)
eg : Point2D createNewPoint(int xOff,iny yOff){...}
3.5 Add calculateDistance method to calculate distance between current point & specified point & return the distance to the caller.
(eg double  calcDistance(Point2D p2))
Hint : Use distance formula . Use java.lang.Math class methods --sqrt, pow etc.

*/
//package com.app.tester;

import java.lang.Math;

public class Point2D {
  private double x;
  private double y;

  public Point2D(double x, double y) {
    this.x = x;
    this.y = y;
  }

  String getDetails() {
    return "X-cord " + this.x + " y-cord " + this.y;
  }

  boolean isEqual(Point2D p2) {
    return this.x == p2.x && this.y == p2.y;
  }

  Point2D createNewPoint(double xOff, double yOff) {
    Point2D newPoints = new Point2D(this.x + xOff, this.y + yOff);
    return newPoints;
  }

  double calcDistance(Point2D p2) {
    return Math.sqrt(Math.pow((p2.x - this.x), 2) + Math.pow((p2.y - this.y), 2));
  }
}
