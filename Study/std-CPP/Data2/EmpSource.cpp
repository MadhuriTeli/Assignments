#include<iostream>
using namespace std;

class Student
{
private:
	int prn;
	string  name;
	double marks;	
	static string organizationName;
public:
	Student() // no argument constructor
	{
		this->prn = 0;
		this->name = "NA";
		this->marks = 0.0;
	}
	Student(int prn,string name,double marks)
	{
		this->prn = prn;  //cuurent object prn=para
		this->name = name;
		this->marks = marks;

	}
	int getPrn()
	{
		return this->prn;
	}
	void setPrn(int prn)
	{
		this->prn = prn;
	}
	string getName()
	{
		return this->name;
	}
	void  setName(string name)
	{
		this->name = name;
	}
	double getMarks()
	{
		return this->marks;
	}
	void setMarks(double marks)
	{
		this->marks = marks;
	}
	static string getOrganizationName()
	{
		return organizationName;
	}
	static void setOrganizationName(string neworganizationName)
	{
		organizationName = neworganizationName;
	}

	void registerdetails()// take the student details from console/user
	{
		cout << "Enter the prn:" << endl;
		cin >> this->prn;
		cout << "Enter the name:" << endl;
		cin >> this->name;
		cout << "Enter marks:" << endl;
		cin>> this->marks;
	}
	void displaydetails() // display the student details
	{
		cout << "Details are--------------" << endl;
		cout << this->prn << endl;
		cout << this->name << "\n";
		cout << this->marks << endl;
		cout << organizationName<<endl;
	}
	double  calculatemarks()// calculate teh marks of student
	{
		return this->marks;
	}
};
string Student::organizationName = "IACSD";

int main()
{
	/*Student s1(101,"King",89),s2(100,"John",78);
	
	cout << "The name of s1 student is " << s1.getName()<<endl;
	cout << "The name of s2 student is " << s2.getName()<<endl;
	s2.setName("John K");
	cout << "The name of s2 student is " << s2.getName()<<endl;*/

	Student s[3];//array of student objects

	for (int i = 0; i < 3; i++)
	{
		s[i].registerdetails();
	}
	for (int i = 0; i < 3; i++)
	{
			s[i].displaydetails();
		
	}

	Student::setOrganizationName("IACSD Akurdi");

	for (int i = 0; i < 3; i++)
	{
		
			s[i].displaydetails();
		
	}


}