package com.xworkz.tv.entity;

public class TvTester {
	public static void main(String[] args) {
		TvChannelEntity entity = new TvChannelEntity();
		TvChannelDAOImp daoImp = new TvChannelDAOImp();
		entity.setChannelId(4);
		entity.setChannelName("umeshTV");
		entity.setPrice(2000);
		daoImp.save(entity);
		System.out.println("data saved successfully");
		entity.getChannelId();
		System.out.println(daoImp.getbyId(1));
		daoImp.upadate(1990, 1);
		System.out.println("upadted........successfully");
		daoImp.deleteById(1);
	}

}
