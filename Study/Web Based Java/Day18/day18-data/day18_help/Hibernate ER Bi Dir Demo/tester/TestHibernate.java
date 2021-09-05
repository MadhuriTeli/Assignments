package tester;
import static utils.HibernateUtils.getSf;

import org.hibernate.SessionFactory;

public class TestHibernate {

	public static void main(String[] args) {
		//invoke static method of HibernateUtils to trigger class loading => creation of
		//the singleton SF
		try(SessionFactory sf=getSf())
		{
			System.out.println("hibernate started ....SF "+sf);
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
