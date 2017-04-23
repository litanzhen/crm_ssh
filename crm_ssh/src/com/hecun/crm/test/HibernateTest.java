package com.hecun.crm.test;

import com.hecun.crm.dao.UserDao;
import com.hecun.crm.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class HibernateTest {

//    @Resource(name = "userDao")
    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    @Test
    public void fun1(){
        User user = userDao.getByUsercode("m0001");
        System.out.println(user);
    }

    @Autowired
    private SessionFactory sessionFactory;

    @Test
    public void fun2(){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        User user = new User();
        user.setUser_code("001");
        user.setUser_name("szy");
        user.setUser_password("1234");
        user.setUser_state('1');
        session.save(user);

        transaction.commit();
        session.close();
    }
}
