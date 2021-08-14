
public class TestIacsdEmp {

	public static void main(String[] args) {

     int[] arr=new int[5];
     arr[0]=10;
     //UDT-ref type
     //can i create array of IacsdEmployee
     IacsdEmployee[] allEmps=new IacsdEmployee[5];
     
     IacsdEmployee emp1=new IacsdEmployee(101, "Vaishali");
     IacsdEmployee emp2=new IacsdEmployee(102, "Sonali");
     IacsdEmployee emp3=new IacsdEmployee(103, "Priti");
     IacsdEmployee emp4=new IacsdEmployee(104, "Snehal");
     IacsdEmployee emp5=new IacsdEmployee(105, "Pratiksha");
     
     allEmps[0]=emp1;
     allEmps[1]=emp2;
     allEmps[2]=emp3;
     allEmps[3]=emp4;
     allEmps[4]=emp5;
     
     System.out.println("------------------");
    for(int i=0;i<allEmps.length;i++)
    {
    	allEmps[i].display();
    	
    }
    
    //for each
    
    for(IacsdEmployee emp:allEmps)
    {
    	emp.display();
    }
    //seraching emp in array
    //1:Add Eemps in array
    //2:show emp
    //3:search emp
    //4:modify name of 

	}

}
