package com.xworkz.clothes;



import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.transaction.Transaction;

public class ClotheDAOImp implements ClotheDAO{

	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("clothe");
	
	@Override
	public ClotheEntity saveData(ClotheEntity clotheEntity) {
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			entityManager=factory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(clotheEntity);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}
		return clotheEntity;
		
		
		
	}

	@Override
	public ClotheEntity getByClotheId(Integer clotheId) {
		System.out.println("getByClotheId().....started");
		EntityManager manager=null;
		ClotheEntity clotheEntity=null;
		try {
			System.out.println("tryblock is executing....");
			manager=factory.createEntityManager();
			clotheEntity=manager.find(ClotheEntity.class, clotheId);
			
		} catch (Exception e) {
		  e.printStackTrace();	
		} finally {
			if (manager != null) {
				manager.close();
				System.out.println("data is successfully fetched........");
			}
		}
		return clotheEntity;
	}

	@Override
	public ClotheEntity upadteBrandByPrice(String brand, Integer price) {
		System.out.println("upadted method is started...........");
		EntityManager manager = null;
		EntityTransaction transaction = null;
		ClotheEntity clotheEntity=null;
		try {
			System.out.println("try block is executing........");
			manager = factory.createEntityManager();
			clotheEntity=manager.find(ClotheEntity.class,price);
			if (clotheEntity != null) {
				transaction=manager.getTransaction();
				transaction.begin();
				clotheEntity.setBrand(brand);
				transaction.commit();
				
			}
			
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		
		
	}finally {
		if (manager != null) {
			manager.close();
		}
		System.out.println("upadating.......successfully");
	}
		return clotheEntity;

	}

	@Override
	public ClotheEntity deleteById(Integer clotheId) {
		System.out.println("deleteById........is started");
		EntityManager manager = null;
		EntityTransaction transaction=null;
		ClotheEntity clotheEntity=null;
		try {
			System.out.println("try block is executing........");
			manager=factory.createEntityManager();
			clotheEntity=manager.find(ClotheEntity.class,clotheId);
			if (clotheEntity != null) {
				transaction=manager.getTransaction();
				transaction.begin();
				manager.remove(clotheEntity);
				transaction.commit();
				
			}
			
			
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}finally {
			if (manager != null) {
				manager.close();
			}
		}
		System.out.println("deleted .......successfully");
		return clotheEntity;
	}
}
