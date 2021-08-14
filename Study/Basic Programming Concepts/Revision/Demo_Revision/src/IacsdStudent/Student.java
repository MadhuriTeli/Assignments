package IacsdStudent;

public class Student {
  int rollno;//default 
  private String name;//private not visible outside but inside class
  public String address;//public
  protected double total;
  
  public void acceptData()
  {
	System.out.println("---accept stud info-----");  
	  
  }
  public void displayData()
  {
	  System.out.println("---display stud info-----");  
	  
  }
  
}
