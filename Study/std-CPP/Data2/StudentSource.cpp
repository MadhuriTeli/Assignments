#include<iostream>
using namespace std;

class Student
{
protected:
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

	virtual void registerdetails()// take the student details from console/user
	{
		cout << "Enter the prn:" << endl;
		cin >> this->prn;
		cout << "Enter the name:" << endl;
		cin >> this->name;
		cout << "Enter marks:" << endl;
		cin>> this->marks;
	}
	virtual void displaydetails() // display the student details
	{
		cout << "Details are--------------" << endl;
		cout << this->prn << endl;
		cout << this->name << "\n";
		cout << this->marks << endl;
		cout << organizationName<<endl;
	}
	virtual double calculatepercentage() = 0;// calculate teh marks of student
	
};
string Student::organizationName = "IACSD";
class EdacStudent :public Student
{
private:
	char projectGrade;
public:
	EdacStudent() 
	{
		this->projectGrade = 'N';
	}
	EdacStudent(int prnno, string sname, double smarks, char projectGrade)
		:Student(prnno,sname,smarks)
	{		
		this->projectGrade = projectGrade;
	}
	void displaydetails()
	{
		Student::displaydetails();
		cout << " Project grade is:"<<this->projectGrade<<endl;
	}
	void registerdetails()
	{
		Student::registerdetails();
		cout << "Enter project grade:";
		cin >> this->projectGrade;
	}
	double calculatepercentage()
	{
		return (this->marks / 10) ;
	}

};
class EdbdaStudent :public Student
{
private:
	char attendanceGrade;
public:
	EdbdaStudent()
	{
		this->attendanceGrade = 'N';
	}
	EdbdaStudent(int prn, string name, double marks, char attendanceGrade)
		:Student(prn,name,marks)
	{
		this->attendanceGrade = attendanceGrade;
	}
	void displaydetails()
	{
		Student::displaydetails();
		cout << "The attendance grade is " << this->attendanceGrade<<endl;
	}
	void registerdetails()
	{
		Student::registerdetails();
		cout << "Enter attendance grade:";
		cin >> this->attendanceGrade;

	}
	double calculatepercentage()
	{
		return (this->marks / 9);
	}

};

class PrintToScreen
{
public:
	static void registerStudent(Student* student)
	{
		student->registerdetails();
	}
	static void displayStudent(Student* student)
	{
		student->displaydetails();//different response is given by this line
		//based on runtime type. it is having polymorphic output
	}
	static void printPercentage(Student* student)
	{
		cout << "Percentage are:" << student->calculatepercentage();
	}
};

int main()
{

	Student* s[2];
	int choice;
	for (int i = 0; i < 2; i++)
	{
		cout << "1. EdacStudent \n 2. Edbda Student"<<endl;
		cout << "Enter choice:";
		cin >> choice;
		switch (choice)
		{
		case 1:
			s[i] = new EdacStudent();
			PrintToScreen::registerStudent(s[i]);
			break;
		case 2:
			s[i] = new EdbdaStudent();
			PrintToScreen::registerStudent(s[i]);
			break;
		}
	}

	for (int i = 0; i < 2; i++)
	{
		PrintToScreen::displayStudent(s[i]);
		PrintToScreen::printPercentage(s[i]);
	}
	//EdacStudent s1;
	//EdbdaStudent s2;

	//
	//PrintToScreen::registerStudent(&s1);//edacstudet
	//PrintToScreen::registerStudent(&s2);//edbdastudent
	//PrintToScreen::displayStudent(&s1);//edacstudent
	//PrintToScreen::displayStudent(&s2);//edbdastudent



	//EdacStudent s1;
	//EdacStudent s3(100, "king", 800, 'B');
	//EdbdaStudent s2;
	

	/*Student s1(101,"King",89),s2(100,"John",78);
	
	cout << "The name of s1 student is " << s1.getName()<<endl;
	cout << "The name of s2 student is " << s2.getName()<<endl;
	s2.setName("John K");
	cout << "The name of s2 student is " << s2.getName()<<endl;*/

	//Student s[3];//array of student objects

	//for (int i = 0; i < 3; i++)
	//{
	//	s[i].registerdetails();
	//}
	//for (int i = 0; i < 3; i++)
	//{
	//		s[i].displaydetails();
	//	
	//}

	//Student::setOrganizationName("IACSD Akurdi");

	//for (int i = 0; i < 3; i++)
	//{
	//	
	//		s[i].displaydetails();
	//	
	//}


}