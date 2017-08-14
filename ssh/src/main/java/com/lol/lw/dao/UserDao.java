package com.lol.lw.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.lol.lw.entity.Detail;
import com.lol.lw.entity.User;
import com.lol.lw.utils.HibernateUtils;

@Repository("userDao")
public class UserDao {
  //private HibernateTemplate hibernateTemplate;
  /*public HibernateTemplate getHibernateTemplate() {
    return hibernateTemplate;
  }

  @Autowired(required = true)
  public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
    this.hibernateTemplate = hibernateTemplate;
  }*/

  public List<User> getUsers() {
    Session session =  HibernateUtils.openSession();
    Transaction tx = null;
    try {
        tx = session.beginTransaction();
        List<User> list = session.createQuery("FROM User").list(); 
        tx.commit();
        return list;
    } catch (RuntimeException e) {
        tx.rollback();
        throw e;
    } finally {
        session.close();
    }
  }

  public void saveUsers(User user) {
   /* hibernateTemplate.save(user);*/
  }

  public void updateUser(User user) {
   // hibernateTemplate.update(user);
  }

  public void deleteUser(User user) {
   // hibernateTemplate.delete(user);
  }
}
