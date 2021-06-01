/*
1. Create a class Person with data members as name, age, city. Write getters and setters for all the data
members. Also add the display function. Create Default and Parameterized constructors. Create the
object of this class in main method and invoke all the methods in that class.
*/
#include <iostream>
using namespace std;
class Person
{
private:
  string name;
  int age;
  string city;

public:
  Person()
  {
    this->name = "";
    this->age = 0;
    this->city = "";
  }
  Person(string pname, int page, string pcity)
  {
    this->name = pname;
    this->age = page;
    this->city = pcity;
  }

  string getPersonName()
  {
    return this->name;
  }
  void setPersonName(string pname)
  {
    this->name = pname;
  }

  int getPersonAge()
  {
    return this->age;
  }
  void setPersonAge(int page)
  {
    this->age = page;
  }

  string getPersonCity()
  {
    return this->city;
  }
  void setPersonCity(string pcity)
  {
    this->city = pcity;
  }

  void display()
  {
    cout << "----------------Person Details-------------------" << endl;
    cout << "Person Name: " << this->name << endl;
    cout << "Person Age : " << this->age << endl;
    cout << "Person City: " << this->city << endl;
  }
};
int main()
{
  Person p1;
  Person p2("Bob", 2, "Cape");
  p1.display();
  p2.display();
  p1.setPersonName("Alice");
  p1.setPersonAge(25);
  p1.setPersonCity("Seoule");
  p1.display();
  cout << "name " << p2.getPersonName() << endl;
  cout << "age " << p2.getPersonAge() << endl;
  cout << "city " << p2.getPersonCity() << endl;
}
