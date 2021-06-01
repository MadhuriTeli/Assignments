/*
2. Create a class Date with data members as dd, mm, yy. Write getters and setters for all the data
members. Also add the display function. Create Default and Parameterized constructors. Create the
object of this class in main method and invoke all the methods in that class.
*/
#include <iostream>
using namespace std;
class Date
{
private:
  int dd;
  int mm;
  int yy;

public:
  Date()
  {
    this->dd = 0;
    this->mm = 0;
    this->yy = 0;
  }
  Date(int Ddd, int Dmm, int Dyy)
  {
    this->dd = Ddd;
    this->mm = Dmm;
    this->yy = Dyy;
  }

  int getday()
  {
    return this->dd;
  }
  void setday(int dday)
  {
    this->dd = dday;
  }

  int getMonth()
  {
    return this->mm;
  }
  void setMonth(int dmm)
  {
    this->mm = dmm;
  }
  int getYear()
  {
    return this->yy;
  }
  void setYear(int dyr)
  {
    this->yy = dyr;
  }

  void display()
  {
    cout << "---------------- Details-------------------" << endl;
    cout << "Day: " << this->dd << endl;
    cout << "Month : " << this->mm << endl;
    cout << "Year : " << this->yy << endl;
  }
};
int main()
{
  Date d1;
  Date d2(07, 04, 1998);
  d1.display();
  d2.display();
  d1.setday(8);
  d1.setMonth(9);
  d1.setYear(2020);
  d1.display();
  cout << "Day: " << d1.getday() << endl;
  cout << "Month : " << d1.getMonth() << endl;
  cout << "Year : " << d1.getYear() << endl;
}
