package com.hecun.crm.service;

import com.hecun.crm.domain.LinkMan;
import com.hecun.crm.utils.PageBean;
import org.hibernate.criterion.DetachedCriteria;


public interface LinkManService {
	//保存联系人
	void save(LinkMan linkMan);
	//联系人列表
	PageBean getPageBean(DetachedCriteria dc, Integer currentPage, Integer pageSize);
	//根据id获得LinkMan对象
	LinkMan getById(Long lkm_id);

}
