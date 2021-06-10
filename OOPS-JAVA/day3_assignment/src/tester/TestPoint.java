/*
3.6 Write TestPoint class , under "com.app.tester" package with a main method
Accept co ordinates of 2 points from user (Scanner) --p1 & p2

3.7 Use getDetails method to display point details.(p1's details & p2's details)

3.8 Invoke isEqual & display if points are same or different (i.e p1 & p2 are located at the same position)

3.9 Create new point p3 , with the dimensions offset from p1.
I/P --x offset & y offset

3.10 Display distance between 2 points.(between p1 & p2)
*/
//package com.app.tester;
package tester;
import java.util.Scanner;
import com.geometry.Point2D;
public class TestPoint {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter co ordinates of 2 points ");
    Point2D p1 = new Point2D(sc.nextDouble(), sc.nextDouble());
    Point2D p2 = new Point2D(sc.nextDouble(), sc.nextDouble());

    System.out.println("Point P1 Details: " + p1.getDetails());

    System.out.println("Point P2 Details: " + p2.getDetails());

    System.out.println(
        p1.isEqual(p2) ? "p1 & p2 are located at the same position" : "p1 & p2 are located at Different position");
    System.out.println("enter Offset for p1");
    Point2D p3 = p1.createNewPoint(sc.nextDouble(), sc.nextDouble());
    System.out.println("Point P1 Details: " + p1.getDetails());

    System.out.println("New Point P3 Details: " + p3.getDetails());

    System.err.println("Distance between p1 and p2 points: " + p1.calcDistance(p2));
    sc.close();
  }

}
