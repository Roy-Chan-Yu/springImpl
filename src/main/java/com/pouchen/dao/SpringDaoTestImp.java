package com.pouchen.dao;

import java.util.List;

import javax.security.auth.x500.X500Principal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pouchen.bean.Spring;
import com.pouchen.dto.Employee;

public class SpringDaoTestImp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		SpringDao sDao = (SpringDao) context.getBean("sdao");
		int status = 0;
		status = sDao.saveSpring(new Spring(107,"Amit",35000));
//		status = sDao.updSpring(new Spring(102,"Amit-upd",20000));
//		status = sDao.delSpring(new Spring(102));
		System.out.println(status);
		
		List<Spring> list = sDao.getAllSprings();
		list.forEach(x -> System.out.println(x.getId()+" "+x.getName()+ " " +x.getSalary()));
	}

}
