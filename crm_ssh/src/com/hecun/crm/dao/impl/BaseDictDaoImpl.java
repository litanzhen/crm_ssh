package com.hecun.crm.dao.impl;

import java.io.Serializable;
import java.util.List;

import com.hecun.crm.dao.BaseDictDao;
import com.hecun.crm.domain.BaseDict;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;


public class BaseDictDaoImpl extends BaseDaoImpl<BaseDict> implements BaseDictDao {

	@Override
	public List<BaseDict> getListByTypeCode(String dict_type_code) {
		//Criteria,直接就查询出了list对象
		
		//创建离线查询对象
		DetachedCriteria dc = DetachedCriteria.forClass(BaseDict.class);
		//封装条件
		dc.add(Restrictions.eq("dict_type_code", dict_type_code));
		//执行查询
		List<BaseDict> list = (List<BaseDict>) getHibernateTemplate().findByCriteria(dc);
		
		return list;
	}}
