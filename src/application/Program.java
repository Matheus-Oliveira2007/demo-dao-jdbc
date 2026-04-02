package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println(sellerDao.findById(5));
		
		System.out.println("==== Test 01====");
		
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartament(dep);
		for(Seller obj : list) {
			System.out.println(obj);
		}

	}

}
