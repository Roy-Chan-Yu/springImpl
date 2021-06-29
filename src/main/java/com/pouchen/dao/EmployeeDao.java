package com.pouchen.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.FlushMode;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pouchen.bean.Employee;

@Transactional
@Service
public class EmployeeDao {

	HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	
	public void saveEmployee(Employee e) {
		template.save(e);
	}
	
	public void updateEmployee(Employee e) {
		template.saveOrUpdate(e);
	}
	
	public void deleteEmployee(Employee e) {
		template.delete(e);
	}
	
	public Employee getById(int id) {
		Employee employee = template.get(Employee.class, id);
		return employee;
	}
	
	public List<Employee> getEmployees() {
		List<Employee> list = new ArrayList<Employee>();
		list = template.loadAll(Employee.class);
		return list;
	}
	
}
