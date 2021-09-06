package com.app.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojo.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private SessionFactory sf;

	@Override
	public String addEmployee(Employee emp) {
		try {
			sf.getCurrentSession().persist(emp);
			return "Successfully added";
		} catch (HibernateException e) {
			throw e;
		}
	}

	@Override
	public List<Employee> viewEmployees() {
		String jpql = "select e from Employee e";
		List<Employee> emps = null;
		emps = sf.getCurrentSession().createQuery(jpql, Employee.class).getResultList();
		return emps;
	}

	@Override
	public Employee getEmployee(int id) {
		return sf.getCurrentSession().get(Employee.class, id);
	}

	@Override
	public String updateEmployee(int id, double sal) {
		String status ="Updation Succesfull";
		try
		{	
		String jpql = "select e from Employee e where e.id=:id";
		Employee e = sf.getCurrentSession().createQuery(jpql, Employee.class).setParameter("id", id).getSingleResult();
		e.setSalary(sal);
		sf.getCurrentSession().saveOrUpdate(e);
		}catch(HibernateException e)
		{
			status = "Updation Unsuccesfull";
			throw e;
		}
		return status;
	}

	@Override
	public String deleteEmployee(int id) {
		String status ="Delete Succesfull";
		try
		{	
		Employee e = new Employee();
		e.setId(id);
		sf.getCurrentSession().delete(e);
		}catch(HibernateException e)
		{
			status = "Delete Unsuccesfull";
		}
		return status;
	}

}
