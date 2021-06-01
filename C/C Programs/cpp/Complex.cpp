/*
5. Create a class ComplexNumber with data members real, imaginary. Create Default and
Parameterized constructors. Write getters and setters for all the data members. Also add the display
function. Create the object of this class in main method and invoke all the methods in that class.
*/
#include <iostream>
using namespace std;
class ComplexNumber
{
private:
  int real;
  int img;

public:
  ComplexNumber()
  {
    this->real = 0;
    this->img = 0;
  }
  ComplexNumber(int xd, int Dy)
  {
    this->real = xd;
    this->img = Dy;
  }

  int getReal()
  {
    return this->real;
  }
  void setReal(int xay)
  {
    this->real = xay;
  }

  int getImaginary()
  {
    return this->img;
  }
  void setImaginary(int dy)
  {
    this->img = dy;
  }

  void display()
  {
    cout << "---------------- Details-------------------" << endl;
    cout << "Real: " << this->real << endl;
    cout << "Imaginary : " << this->img << endl;
  }
};
int main()
{
  ComplexNumber p1;
  ComplexNumber p2(4, 9);
  p1.display();
  p2.display();
  p1.setReal(5);
  p1.setImaginary(15);
  p1.display();
  cout << "X: " << p1.getReal() << endl;
  cout << "Y : " << p1.getImaginary() << endl;
}
