package com.hecun.crm.service.impl;

import com.hecun.crm.dao.BaseDictDao;
import com.hecun.crm.domain.BaseDict;
import com.hecun.crm.service.BaseDictService;

import java.util.List;



public class BaseDictServiceImpl implements BaseDictService {
	
	private BaseDictDao bdd;
	
	@Override
	public List<BaseDict> getListByTypeCode(String dict_type_code) {
		return bdd.getListByTypeCode(dict_type_code);
	}

	public void setBdd(BaseDictDao bdd) {
		this.bdd = bdd;
	}

}
