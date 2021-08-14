package IacsdStaticExample;

public class TEstStatic {
	
	public static void main(String[] args) {
		
		
		Employee.showCEO();
		
		Employee ram=new Employee();
		ram.id=10;
		ram.salary=20000;
//		ram.compName="New Vision";
//		ram.CEO="Raman";
		
		
		Employee sham=new Employee();
		sham.id=12;
		sham.salary=34000;
//		sham.compName="New Vision";
//		sham.CEO="Raman";
		
		
		
		Employee mgr=new Employee();
		mgr.id=101;
		mgr.salary=90000;
//		mgr.CEO="Rajan";
//		mgr.compName="New Vision pvt ltd";
		
		ram.display();
		sham.display();
		mgr.display();
		
	}

}
