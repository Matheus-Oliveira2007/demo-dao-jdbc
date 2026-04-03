package application;


import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;


public class Program2 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.println(departmentDao.findById(4));
		
		System.out.println("==== Test 01====");
		List<Department> list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}

		/*System.out.println("==== Test 03====");
		Department newDepartment = new Department(null,"Agro");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		
		System.out.println("==== Test 04====");
		Department	Department = departmentDao.findById(1);;
		Department.setName("Agro");
		departmentDao.update(Department);
		System.out.println("Update id = " + Department.getId());*/
		
		/*System.out.println("==== Test 05====");
		System.out.print("Informe o id: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);*/
	}


	}


