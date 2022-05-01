package com.xworkz.clothes;

import java.util.Date;

public class ClotheTester {
	public static void main(String[] args) {
		Date date=new Date();
		ClotheEntity clotheEntity = new ClotheEntity();
		ClotheDAOImp clotheDAOImp = new ClotheDAOImp();
		clotheEntity.setClotheId(2);
		clotheEntity.setBrand("uu");
		clotheEntity.setPrice(200);
		clotheEntity.setManifacturedYear(date);
		//clotheEntity.setManifacturedYear(localeString);
		clotheDAOImp.saveData(clotheEntity);
		System.out.println("data saved");
		System.out.println("----------------------------------");
		//System.out.println(clotheDAOImp.getByClotheId(1));
		System.out.println("..........................");
	//	clotheDAOImp.upadteBrandByPrice("nam brand", 1);
		System.out.println("<><><><><><><><><><><><><><><><><><><><<>");
		clotheEntity.getClotheId();
		//clotheDAOImp.deleteById(1);
	}

}
