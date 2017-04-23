package com.hecun.crm.dao.impl;

import com.hecun.crm.dao.UserDao;
import com.hecun.crm.domain.User;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
    @Override
    public User getByUsercode(String usercode) {
        //HQL
//        return getHibernateTemplate().execute(new HibernateCallback<User>() {
//            @Override
//            public User doInHibernate(Session session) throws HibernateException {
//               String hql = "from User where user_code = ?";
//                Query query = session.createQuery(hql);
//                query.setParameter(0, usercode);
//                User user = (User) query.uniqueResult();
//                return user;
//            }
//        });

        //HQL
//        return getHibernateTemplate().execute(new HibernateCallback<User>() {
//            @Override
//            public User doInHibernate(Session session) throws HibernateException {
//                String hql = "from User where user_code = ?";
//                Query query = session.createQuery(hql);
//                User user = (User) query.uniqueResult();
//                return user;
//            }
//        });

        //HQL lambda
//        return getHibernateTemplate().execute((session) -> {
//            String hql = "from User where user_code = ?";
//            Query query = session.createQuery(hql);
//            User user = (User) query.uniqueResult();
//            return user;
//        });

        //Criteria
        DetachedCriteria detachedCriteria = DetachedCriteria.forClass(User.class);
        detachedCriteria.add(Restrictions.eq("user_code", usercode));
        List<User> list = (List<User>) getHibernateTemplate().findByCriteria(detachedCriteria);
        if (list != null && list.size() > 0){
            return list.get(0);
        } else {
            return null;
        }
    }
}
