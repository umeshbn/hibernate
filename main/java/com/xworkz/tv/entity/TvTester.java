package com.xworkz.tv.entity;

public class TvTester {
	public static void main(String[] args) {
		TvChannelEntity entity = new TvChannelEntity();
		TvChannelDAOImp daoImp = new TvChannelDAOImp();
		entity.setChannelId(1);
		entity.setChannelName("btv");
		entity.setPrice(100);
		daoImp.save(entity);
		System.out.println("data saved successfully");
		entity.getChannelId();
		daoImp.getbyId(1);
		System.out.println("getting data");
	}

}
