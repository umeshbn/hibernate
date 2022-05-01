package com.xworkz.tv.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.transaction.Transaction;

public class TvChannelDAOImp implements TvChannelDAO {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("tv");

	@Override
	public void save(TvChannelEntity channelEntity) {
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {

			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(channelEntity);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}
	}

	@Override
	public TvChannelEntity getbyId(Integer channelId) {

		EntityManager manager = null;
		TvChannelEntity entity = null;
		try {

			manager = factory.createEntityManager();
			entity = manager.find(TvChannelEntity.class, channelId);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}
		return entity;
	}

	@Override
	public void upadate(Integer price, Integer channelId) {
		System.out.println("upadted method is started...........");
		EntityManager manager = null;
		EntityTransaction transaction = null;
		TvChannelEntity channelEntity = null;
		try {
			System.out.println("try block is executing........");
			manager = factory.createEntityManager();
			channelEntity = manager.find(TvChannelEntity.class, channelId);
			if (channelEntity != null) {
				transaction = manager.getTransaction();
				transaction.begin();
				channelEntity.setPrice(price);
				manager.merge(channelEntity);
				transaction.commit();
				System.out.println("upadated....successfully");
			}
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();

			}
		}

	}

	@Override
	public void deleteById(Integer ChannelId) {
		System.out.println("deleteById........is started");
		EntityManager manager = null;
		TvChannelEntity channelEntity = null;
		try {
			System.out.println("try block is executing........");
			manager = factory.createEntityManager();
			channelEntity = manager.find(TvChannelEntity.class, ChannelId);
			
			if (channelEntity != null) {
				
				channelEntity=manager.find(TvChannelEntity.class, channelEntity);
				manager.remove(channelEntity);
				
				System.out.println("deleted..........successfully");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (manager != null) {
				manager.close();
			}
		}

	}
	
}
