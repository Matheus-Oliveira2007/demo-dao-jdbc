package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println(sellerDao.findById(5));
		
		System.out.println("==== Test 01====");
		
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartament(dep);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("==== Test 02====");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}

		/*System.out.println("==== Test 03====");
		Seller newSeller = new Seller(null,"João","greg@gmail.com",new Date(),4000.0,dep);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("==== Test 04====");
		Seller	seller = sellerDao.findById(1);;
		seller.setName("Matheus");
		sellerDao.update(seller);
		System.out.println("Update id = " + seller.getId());*/
		
		System.out.println("==== Test 05====");
		System.out.println("Informe o id: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
	}

}
