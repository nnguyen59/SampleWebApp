package com.hcc.advweb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FileConnection {

	/**
	 * 
	 * @return
	 * @throws IOException 
	 */
	public ArrayList<Student> readingAllProduct() throws IOException{
		ArrayList<String> arrLstProduct = new ArrayList<String>(); // array list use to store full transaction string 

		String strCurrentLine;
		BufferedReader br = new BufferedReader(new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("mysql.txt")));

		// get transaction from database and store in array list
		while ((strCurrentLine = br.readLine()) != null) {

			arrLstProduct.add(strCurrentLine);
		}
		return splitProductInfomation(arrLstProduct);
	}

	/**
	 * 
	 * @param arrLstProduct
	 * @return
	 */
	public static ArrayList<Student> splitProductInfomation(ArrayList<String> arrLstProduct){
		ArrayList<Student> productLst = new ArrayList<Student>();
		Student productObj;
		String[] productTmp;
		for(int i = 0; i < arrLstProduct.size(); i++){
			productTmp = arrLstProduct.get(i).trim().split("-");

			productObj = new Student();
			productObj.setId(Integer.parseInt(productTmp[0]));
			productObj.setFname((productTmp[1]));
			productObj.setLname(productTmp[2]);
			productObj.setPhone(productTmp[3]);
			productLst.add(productObj);
		}

		return productLst;

	}
}
