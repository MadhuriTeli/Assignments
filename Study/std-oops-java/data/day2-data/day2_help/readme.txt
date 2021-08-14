Today's topics

 
JVM Architecture
Enter OOPs  -- encapsulation , data hiding
(class programming)


Revise

Java Data Types : which 2 categories
Types of conversion 
solve : 

byte b1=10;
int data=b1;
float f=23.45F;//javac err  : RHS : double LHS : float : not an auto promotion
double d1=f;
long l1=454654;
f=l1;//long ---> float : auto promotion

Answer this 
What will data type of result of
1. byte & byte : int
2. byte & short : int
3. short & short : int
4. int & long : long
5. long & float : float
6. float & double : double
7. byte/short/int....& double : double

eg : Test.java
class A
{
 psvm()
 {
   sop("1");
 }
}
class B
{
 psvm()
 {
   sop("2");
 }
}
class C
{
   psvm()
 {
   sop("3");
 }
}
eg java A
1




--------------------------------------------
JVM Architecture


Enter OOP
refer to "regarding class n object"

Encapsulation -- Class Programming (refer to 
class,object,state,behaviour
Objective --
Create a class to represent 3D Box
class Box ---tight encapsulation(achieved by making all non static data members:instance vars private)
state -- width,height , depth --- double : private 
paramterized constr --3 arg constr.
Instance Methods
1. To return Box details in String form (dimensions of Box)

method declaration --- access specifier(private/default/protected/public) , ret type , name , args
method definition --body

2. To return computed volume of the box.






this --keyword in java
Usages
1. To un-hide instance variable from local variable.
eg : this.width=width;

2. To invoke constructor of the same class , from different constructor.
eg : this(side,side,side);


Create another class : TestBox --for  UI.
Add psvmain(..){...}
Use scanner --to accept box dims from user, create box instance.
display its details & volume.

solve :
Box b1=new Box(1,2,3);
Box b2=b1;
Box b3=b1;
b1=b2=b3=null;//How many objects are marked GC ? : 1
System.gc();//req --> accepted --which method GC thread will call auto? : finalize() .
-----------------
Pointers vs java references
Similarity -- Pointer & reference --hold an address to the object created on heap.
Difference -- To add robustness to the language ,
pointer arithmatic is not allowed in java.

reference --- holds internal representation of address --

eg : 
Box b1=new Box(1,2,3);
b1++;//javac err
b1 += 10; //javac err
String s=new String("hello");
s += 10;//javac err

------------------
1. Create Cubes
sop("Enter side of a cube");
Box cube=new Box(sc.nextDouble());//javac err : no maching constr
//suggest : a soln

2. Add a method to Box class to compare equality of 2 boxes.
eg : TestBox
Box b1=new Box(....);
Box b2=new Box(....);
//how will you invoke equality checking method : isEqual
sop(b1.isEqual(b2)?"SAME":"DIFFERENT");
-------------
Box.java
boolean isEqual(Box anotherBox)//anotherBox=b2 : copy of refs
{
  return this.width == anotherBox.width && this.depth == anotherBox.depth && this.height == anotherBox.height;
}


3. Add a method to Box class to return a new Box with modified offset dims & test it with the tester.
eg : 1st Box dims 10,20,30
Box b1=new Box(....);
User enters offsets as 3,-4,5
sop("Enter offsets from 1st box"); : 3,-4,5
2nd box should have dims 13,16,35
Box b2 ---> dims : 13,16,35
Box b2=b1.createNewBox(sc.nextDouble(),.....);
sop(b2.getBoxDims());



Mem pictures
Garbage Collection

