package tester;

import static utils.CollectionUtils.populateEmpData;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import com.app.core.Department;
import com.app.core.Emp;
import static com.app.core.Emp.sdf;

public class TestIterator2 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			// get populated emp list.
			ArrayList<Emp> list = populateEmpData();
			System.out.println("List contents ");
			for(Emp e : list)
				System.out.println(e);
			System.out.println("Enter dept n join date");
			Department d=Department.valueOf(sc.next().toUpperCase());
			Date joinDate=sdf.parse(sc.next());
			// Display emp names from a specific department , joined after specific date.
			//attach itr
			Iterator<Emp> itr=list.iterator();
			System.out.println("Emp names from "+d+" joined after "+sdf.format(joinDate));
			while(itr.hasNext())
			{
				Emp e=itr.next();
				if(e.getDept().equals(d) && e.getJoinDate().after(joinDate))
					System.out.println(e.getName());
			}//can be replaced by for-each : try it in the lab!

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
