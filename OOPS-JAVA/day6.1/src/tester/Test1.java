package tester;

import shapes.BoundedShape;
import shapes.Circle;
import shapes.Rectangle;

public class Test1 {

	public static void main(String[] args) {
	//	BoundedShape shape=new BoundedShape();
		//Can you create instance of abstract class : NO
		//Can you use abstract super cls ref ----> concrete sub class instance : YES
		BoundedShape shape=new Circle(10, 20, 20.5);//up casting
		System.out.println(shape.area());//JVM : type obj : circle
		shape=new Rectangle(50, 20, 12, 14);//up casting
		System.out.println(shape.area());//JVM : type obj : rect
		final BoundedShape s1=new Circle(10,20, 15);
	//	s1=new Circle(11,20, 15); final refs can't be re-assigned

	}

}
