package com.lol.lw.dao;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.lol.lw.entity.Detail;
import com.lol.lw.entity.User;
import com.lol.lw.entity.UserOrder;
import com.lol.lw.utils.HibernateUtils;

@Repository("ManyToOneDao")
public class ManyToOneDao {
  public List<Detail> getDetail(){
    Session session =  HibernateUtils.openSession();
    Transaction tx = null;
    try {
        tx = session.beginTransaction();
        //-------------一对多--------------
         List<User> userList =session.createQuery("FROM User where id=2").list();
        Set<UserOrder> set = userList.get(0).getSet();
        System.err.println(userList.get(0).toString());
        for (UserOrder obj : set) {  
          System.out.println(obj.toString());  
    }  
        //---------------------------------
        List<Detail> list = session.createQuery("FROM Detail").list();
        System.err.println(list.get(0).getUser().toString());
        tx.commit();
        return list;
    } catch (RuntimeException e) {
        tx.rollback();
        throw e;
    } finally {
        session.close();
    }
  };
}