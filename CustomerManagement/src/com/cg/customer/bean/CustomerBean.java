package com.cg.customer.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="cust_table")
public class CustomerBean 
{
	@Column(name="cust_name")
	private String customerName;
	@Id
	@Column(name="cust_id")
	private int customerId;
	@Column(name="cust_phone")
	private String customerPhone;
	@Column(name="cust_email")
	private String custEmail;
	@Column(name="cust_dob")
	private Date custDob;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public Date getCustDob() {
		return custDob;
	}
	public void setCustDob(Date custDob) {
		this.custDob = custDob;
	}
	@Override
	public String toString() {
		return "CustomerBean [customerName=" + customerName + ", customerId="
				+ customerId + ", customerPhone=" + customerPhone
				+ ", custEmail=" + custEmail + ", custDob=" + custDob
				+ ", getCustomerName()=" + getCustomerName()
				+ ", getCustomerId()=" + getCustomerId()
				+ ", getCustomerPhone()=" + getCustomerPhone()
				+ ", getCustEmail()=" + getCustEmail() + ", getCustDob()="
				+ getCustDob() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public CustomerBean(String customerName, int customerId,
			String customerPhone, String custEmail, Date custDob) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerPhone = customerPhone;
		this.custEmail = custEmail;
		this.custDob = custDob;
	}
	public CustomerBean()
	{
		
	}
	

}
