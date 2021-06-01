/* Task: Create a product class 
productid, name price
registerproduct(), displayProductDetails(), calculatedDiscount()

Update: static Brand
static getter setter for brand 
array of products and get details from uerd and display it
update brand name and again display

*/
#include <iostream>
using namespace std;
class Product
{
private:
  int productId;
  string name;
  double price;
  static string brandName;

public:
  Product()
  {
    this->productId = 0;
    this->name = "";
    this->price = 0.0;
  }
  Product(int prdId, string pname, double prprice)
  {
    this->productId = prdId;
    this->name = pname;
    this->price = prprice;
  }
  //getter setter for ID
  int getProductId()
  {
    return this->productId;
  }

  void setProductId(int pId)
  {
    this->productId = pId;
  }

  //getter setter for name
  string getProductName()
  {
    return this->name;
  }
  void setProductNaem(string Pname)
  {
    this->name = Pname;
  }

  //getter setter for price
  double getPrice()
  {
    return this->price;
  }
  void setPrice(double Pprice)
  {
    this->price = Pprice;
  }
  //getter setter for static data member brand

  static string getBrandName()
  {
    return brandName;
  }
  static void setBrandName(string Bname)
  {
    brandName = Bname;
  }

  void registerProduct()
  {
    cout << "enter ProductId, name, price" << endl;
    cin >> this->productId >> this->name >> this->price;
  }

  void displayDetails()
  {
    cout << "----------------Product Details-------------------" << endl;
    cout << "ProductID: " << this->productId << endl;
    cout << "Product Name: " << this->name << endl;
    cout << "Product Price: " << this->price << endl;
    cout << "Brand Name: " << brandName << endl;
  }

  double calculateDiscount()
  {
    return this->price * 0.1;
  }
};
string Product ::brandName = "Apple";

int main()
{
  /*
  Product prod1;
  Product prod2(1, "laptop", 30000.00);
  prod1.displayDetails();
  prod2.displayDetails();

  prod1.registerProduct();
  prod2.registerProduct();
  prod1.displayDetails();
  prod2.displayDetails();

  cout << "Product Discount" << prod1.calculateDiscount();
  cout << "Product Discount" << prod2.calculateDiscount();
*/

  Product p[2]; //array of products
  for (int i = 0; i < 2; i++)
  {
    p[i].registerProduct();
  }
  for (int i = 0; i < 2; i++)
  {
    p[i].displayDetails();
  }

  Product::setBrandName("Google");
  for (int i = 0; i < 2; i++)
  {
    p[i].displayDetails();
  }
}
