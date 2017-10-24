package com.cg.customer.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.customer.bean.CustomerBean;








@Repository
@Transactional
public class CustomerDao
{
	@PersistenceContext
	private EntityManager entityManager;
	
	
	public CustomerBean addCustomer(CustomerBean customer) {
		System.out.println("DaoEntry");
		entityManager.persist(customer);
		entityManager.flush();
		System.out.println("DaoExit");
		return customer;
	}
	
	

	/*public void updateCustomer(Customer customer) 
	{
		entityManager.merge(customer);
		
	}*/

	/*public void removeCustomer(Customer customer) 
	{
		entityManager.remove(customer);
		
	}
	
	public List<Customer> getAll() {
		Query query = entityManager.createNamedQuery("getAll");
		@SuppressWarnings("unchecked")
		List<Customer> allList = query.getResultList();
		return allList;
	}
	
	

	public List<Customer> getCustomerByMobile(String mobile)
	{
		String qStr = "SELECT c FROM Customer c WHERE c.custPhone =:pmobno";
		TypedQuery<Customer> query = entityManager.createQuery(qStr, Customer.class);
		query.setParameter("pmobno", mobile);
		List<Customer> mobList = query.getResultList();
		System.out.println(mobList);
		return mobList;
	}
	
*/

	}	

