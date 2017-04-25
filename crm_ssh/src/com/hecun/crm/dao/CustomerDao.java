package com.hecun.crm.dao;

import com.hecun.crm.domain.Customer;

import java.util.List;


public interface CustomerDao extends BaseDao<Customer> {

	//按照行业统计客户数量
	List<Object[]> getIndustryCount();
	
}
