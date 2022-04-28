package com.xworkz.tv.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.transaction.Transaction;

public class TvChannelDAOImp implements TvChannelDAO{

	@Override
	public void save(TvChannelEntity channelEntity) {
		EntityManagerFactory factory=null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
			factory=Persistence.createEntityManagerFactory("tv");
			manager=factory.createEntityManager();
			transaction=manager.getTransaction();
			transaction.begin();
			manager.persist(channelEntity);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}finally {
			if (manager != null) {
				manager.close();
			}
		}
	}

	@Override
	public void getbyId(int channelId) {
		EntityManagerFactory factory=null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
			factory=Persistence.createEntityManagerFactory("tv");
			manager=factory.createEntityManager();
			transaction=manager.getTransaction();
			transaction.begin();
			manager.persist(channelId);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}finally {
			if (manager != null) {
				manager.close();
			}
		}
	}

}
