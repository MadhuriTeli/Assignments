/*
3. Create a class Book with data members as bname,id,author,price. Write getters and setters for all the
data members. Also add the display function. Create Default and Parameterized constructors. Create
the object of this class in main method and invoke all the methods in that class.
*/

#include <iostream>
using namespace std;
class Book
{
private:
  int bid;
  string bname;
  string author;
  double price;

public:
  Book()
  {
    this->bid = 0;
    this->bname = "";
    this->author = "";
    this->price = 0.0;
  }
  Book(int Bid, string Bname, string Bauthor, double Bprice)
  {

    this->bid = Bid;
    this->bname = Bname;
    this->author = Bauthor;
    this->price = Bprice;
  }

  int getBookID()
  {
    return this->bid;
  }

  void setBookID(int BID)
  {
    this->bid = BID;
  }

  string getBookName()
  {
    return this->bname;
  }
  void setBookName(string Bname)
  {
    this->bname = Bname;
  }

  string getBookAuthor()
  {
    return this->author;
  }
  void setBookAuthor(string Author)
  {
    this->author = Author;
  }

  double getBookPrice()
  {
    return this->price;
  }
  void setBookPrice(double Price)
  {
    this->price = Price;
  }

  void display()
  {
    cout << "---------------- Details-------------------" << endl;
    cout << "Id : " << this->bid << endl;
    cout << "Name: " << this->bname << endl;
    cout << "Author : " << this->author << endl;
    cout << "Price : " << this->price << endl;
  }
};
int main()
{
  Book b1;
  Book b2(1, "The Alchemist", "Paulo Cohelo", 300.80);
  b1.display();
  b2.display();
  b2.setBookID(21);
  b2.setBookName("Harry Potter");
  b2.setBookAuthor("J K Rowling");
  b2.setBookPrice(500.67);
  cout << "Id : " << b2.getBookID() << endl;
  cout << "Name: " << b2.getBookName() << endl;
  cout << "Author : " << b2.getBookAuthor() << endl;
  cout << "Price : " << b2.getBookPrice() << endl;
}
