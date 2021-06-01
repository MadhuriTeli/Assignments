/*
4. Create a class Point with data members as x,y. Create Default and Parameterized constructors. Write
getters and setters for all the data members. Also ax the display function. Create the object of this
class in main method and invoke all the methods in that class.
*/
#include <iostream>
using namespace std;
class Point
{
private:
  int x;
  int y;

public:
  Point()
  {
    this->x = 0;
    this->y = 0;
  }
  Point(int xd, int Dy)
  {
    this->x = xd;
    this->y = Dy;
  }

  int getX()
  {
    return this->x;
  }
  void setX(int xay)
  {
    this->x = xay;
  }

  int getY()
  {
    return this->y;
  }
  void setY(int dy)
  {
    this->y = dy;
  }

  void display()
  {
    cout << "---------------- Details-------------------" << endl;
    cout << "x: " << this->x << endl;
    cout << "y : " << this->y << endl;
  }
};
int main()
{
  Point p1;
  Point p2(4, 9);
  p1.display();
  p2.display();
  p1.setX(15);
  p1.setY(15);
  p1.display();
  cout << "X: " << p1.getX() << endl;
  cout << "Y : " << p1.getY() << endl;
}
