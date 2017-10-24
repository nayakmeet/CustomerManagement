package com.cg.customer.service;



import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.cg.customer.bean.CustomerBean;
import com.cg.customer.dao.CustomerDao;

@Service
	
public class CustomerService
{
	@Autowired
	CustomerDao dao;
	public CustomerDao getDao() {
		return dao;
	}
	public void setDao(CustomerDao dao) {
		this.dao = dao;
	}
	public CustomerBean addCustomer(CustomerBean customer) {
		dao.addCustomer(customer);
		return customer;
	}

}
