package com.hecun.crm.service;

import com.hecun.crm.domain.SaleVisit;
import com.hecun.crm.utils.PageBean;
import org.hibernate.criterion.DetachedCriteria;


public interface SaleVisitService {
	//保存客户拜访记录
	void save(SaleVisit saleVisit);
	//客户拜访记录的分页列表
	public PageBean getPageBean(DetachedCriteria dc, Integer currentPage, Integer pageSize);
	//根据id获得客户对象
	SaleVisit getById(String visit_id);

}
