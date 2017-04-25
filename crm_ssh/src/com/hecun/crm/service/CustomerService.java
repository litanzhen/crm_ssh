package com.hecun.crm.service;

import java.util.List;

import com.hecun.crm.domain.Customer;
import com.hecun.crm.utils.PageBean;
import org.hibernate.criterion.DetachedCriteria;

public interface CustomerService {
	//分页业务方法
	PageBean getPageBean(DetachedCriteria dc, Integer currentPage, Integer pageSize);
	//保存客户方法
	void save(Customer customer);
	//根据id获得客户对象
	Customer getById(Long cust_id);
	//获得按行业统计客户数量
	List<Object[]> getIndustryCount();
}
