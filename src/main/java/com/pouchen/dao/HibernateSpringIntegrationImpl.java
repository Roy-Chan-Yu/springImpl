package com.pouchen.dao;

import java.net.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.pouchen.bean.Employee;

public class HibernateSpringIntegrationImpl {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Resource r=new ClassPathResource("applicationContext.xml");  
	    @SuppressWarnings("deprecation")
		BeanFactory factory=new XmlBeanFactory(r);  
		
		EmployeeDao employeeDao =  (EmployeeDao) factory.getBean("d");
		
		Employee employee = new Employee();
		employee.setId(1111);
		employee.setName("Roy");
		employee.setSalary(50000);
		
		
		employeeDao.updateEmployee(employee);
		System.out.println("-----------------");
		
	}

}
