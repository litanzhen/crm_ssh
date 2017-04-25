package com.hecun.crm.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

public interface BaseDao<T> {
	//增或修改
    /*
    saveOrUpdate会自动判断是瞬时态还是游离态,并自动转成持久态
        瞬时态:没有id,没有与session关联
        游离态:有id,没有与session关联
    两者的区别在有没有id,所以saveOrUpdate就看有没有id,根据id判断.
    我们在调用这个方法时,可以给一个对象,对象有无id,决定了save还是update

    因此,修改的话,需要隐藏域放id.因为修改的时候,在action中通过id查询到了customer,并传给了页面,所以有customer对象,所以会回显,会有id,会update
     */
	void saveOrUpdate(T t);
	//增
	void save(T t);
	//删
	void delete(T t);
	//删
	void delete(Serializable id);
	//改
	void update(T t);
	//查 根据id查询
	T	getById(Serializable id);
	//查 符合条件的总记录数
	Integer	getTotalCount(DetachedCriteria dc);
	//查 查询分页列表数据
	List<T> getPageList(DetachedCriteria dc, Integer start, Integer pageSize);
	
}
