package com.hcc.advweb;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.SessionFactory;

@Repository
public class StudentDAOImpl implements StudentDAO {

	private static FileConnection fileConnection = new FileConnection();

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<Student> getStudentsList() {
		ArrayList<Student> arrLstNewProduct = new ArrayList<Student>();
		Student productObj;

		ArrayList<Student> arrLstProduct;
		try {
			arrLstProduct = fileConnection.readingAllProduct();
			for(int i = 0; i < arrLstProduct.size(); i++){

				productObj = arrLstProduct.get(i);
				arrLstNewProduct.add(productObj);

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



		return arrLstNewProduct;
	}

	@Override
	public Student getStudent(int Id) {
		// TODO Auto-generated method stub
		Student product = new Student();

		ArrayList<Student> arrLstProduct;
		try {
			arrLstProduct = fileConnection.readingAllProduct();
			for(int i = 0 ; i < arrLstProduct.size(); i++){
				product = arrLstProduct.get(i);
				if(product.getId() == Id){
					return product;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



		return product;

	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteStudent(int Id) {
		// TODO Auto-generated method stub

	}

	//	@Override
	//	public ArrayList<Student> select(int productStatus) throws IOException {
	//		// TODO Auto-generated method stub
	//		ArrayList<private static FileConnection fileConnection = new FileConnection();
	//
	//		@Override
	//		public ArrayList<Product> select(int productStatus) throws IOException {
	//			// TODO Auto-generated method stub
	//			ArrayList<Product> arrLstNewProduct = new ArrayList<Product>();
	//			Product productObj;
	//
	//			ArrayList<Product> arrLstProduct = fileConnection.readingAllProduct();
	//
	//			for(int i = 0; i < arrLstProduct.size(); i++){
	//
	//				productObj = arrLstProduct.get(i);
	//
	//				if(productObj.getStatus() == productStatus){
	//					arrLstNewProduct.add(productObj);
	//				}
	//			}
	//
	//			return arrLstNewProduct;
	//		}
	//
	//		@Override
	//		public Product getProduct(int productId) throws IOException {
	//			// TODO Auto-generated method stub
	//			Product product = new Product();
	//
	//			ArrayList<Product> arrLstProduct = fileConnection.readingAllProduct();
	//
	//			for(int i = 0 ; i < arrLstProduct.size(); i++){
	//				product = arrLstProduct.get(i);
	//				if(product.getId() == productId){
	//					return product;
	//				}
	//			}
	//
	//			return product;
	//		}
	//
	//		@Override
	//		public ArrayList<Product> pagination(int pageNmb) throws IOException {
	//			// TODO Auto-generated method stub
	//
	//			ArrayList<Product> arrLstProductRtn = new ArrayList<Product>();
	//			int cnt = (pageNmb - 1)*Constant.PAGE_SIZE;
	//
	//			ArrayList<Product> arrLstProduct = fileConnection.readingAllProduct();
	//
	//			while(cnt < pageNmb*Constant.PAGE_SIZE && cnt < arrLstProduct.size()){
	//				arrLstProductRtn.add(arrLstProduct.get(cnt));
	//				cnt++;
	//			}
	//
	//			return arrLstProductRtn;
	//		}
	//
	//		@Override
	//		public int totalPage() throws IOException {
	//			// TODO Auto-generated method stub
	//			int totalPage = 0;
	//
	//			ArrayList<Product> arrLstProduct = fileConnection.readingAllProduct();
	//
	//			totalPage = arrLstProduct.size() / Constant.PAGE_SIZE;
	//
	//			if(arrLstProduct.size() % Constant.PAGE_SIZE > 0){
	//				totalPage ++;
	//			}
	//
	//			return totalPage;
	//		}
	//> arrLstNewProduct = new ArrayList<Product>();
	//		Product productObj;
	//
	//		ArrayList<Product> arrLstProduct = fileConnection.readingAllProduct();
	//
	//		for(int i = 0; i < arrLstProduct.size(); i++){
	//
	//			productObj = arrLstProduct.get(i);
	//
	//			if(productObj.getStatus() == productStatus){
	//				arrLstNewProduct.add(productObj);
	//			}
	//		}
	//
	//		return arrLstNewProduct;
	//	}
	//
	//	@Override
	//	public Product getProduct(int productId) throws IOException {
	//		// TODO Auto-generated method stub
	//		Product product = new Product();
	//
	//		ArrayList<Product> arrLstProduct = fileConnection.readingAllProduct();
	//
	//		for(int i = 0 ; i < arrLstProduct.size(); i++){
	//			product = arrLstProduct.get(i);
	//			if(product.getId() == productId){
	//				return product;
	//			}
	//		}
	//
	//		return product;
	//	}
	//
	//	@Override
	//	public ArrayList<Product> pagination(int pageNmb) throws IOException {
	//		// TODO Auto-generated method stub
	//
	//		ArrayList<Product> arrLstProductRtn = new ArrayList<Product>();
	//		int cnt = (pageNmb - 1)*Constant.PAGE_SIZE;
	//
	//		ArrayList<Product> arrLstProduct = fileConnection.readingAllProduct();
	//
	//		while(cnt < pageNmb*Constant.PAGE_SIZE && cnt < arrLstProduct.size()){
	//			arrLstProductRtn.add(arrLstProduct.get(cnt));
	//			cnt++;
	//		}
	//
	//		return arrLstProductRtn;
	//	}
	//
	//	@Override
	//	public int totalPage() throws IOException {
	//		// TODO Auto-generated method stub
	//		int totalPage = 0;
	//
	//		ArrayList<Product> arrLstProduct = fileConnection.readingAllProduct();
	//
	//		totalPage = arrLstProduct.size() / Constant.PAGE_SIZE;
	//
	//		if(arrLstProduct.size() % Constant.PAGE_SIZE > 0){
	//			totalPage ++;
	//		}
	//
	//		return totalPage;
	//	}


}
