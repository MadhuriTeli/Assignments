#include <iostream>
using namespace std;
class A
{
private:
  int x;

public:
  A()
  {
    this->x = 0;
  }
  A(int xval)
  {
    this->x = xval;
  }

  void fun()
  {
    cout << "In A" << endl;
  }
};

class B : public A
{
private:
  int y;

public:
  B()
  {
    this->y = 0;
  }
  B(int yval)
  {
    this->y = yval;
  }
  void fun()
  {
    cout << "In B" << endl;
  }
};

class C : public A
{
private:
  int z;

public:
  C()
  {
    this->z = 0;
  }
  C(int zval)
  {
    this->z = zval;
  }
  void fun()
  {
    cout << "In C" << endl;
  }
};

int main()
{
  A aObj;
  aObj.fun();

  B bObj;
  bObj.fun();

  C cObj;
  cObj.fun();
}