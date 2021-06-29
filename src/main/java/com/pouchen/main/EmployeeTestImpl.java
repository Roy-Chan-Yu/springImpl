package com.pouchen.main;

import com.pouchen.dto.Address;
import com.pouchen.dto.Employee;

public class EmployeeTestImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address = new Address();
		address.setAddress("Changwa");
		address.setName("Roy");
		Employee e = new Employee(address);
//		e.setAddress(address);
		System.out.println(e.getAddress().getAddress() + " " + e.getAddress().getName());
	}

}
