package com.lol.lw.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.lol.lw.entity.User;
import com.lol.lw.utils.HibernateUtils;


public class RelationTest {

  @Test
  public void testManyToOne() {
    Session session =  HibernateUtils.openSession();
    Transaction tx = null;
    try {
        tx = session.beginTransaction();
        List<User> list = session.createQuery("FROM User").list(); 
        System.err.println(list.get(0).toString());
        tx.commit();
    } catch (RuntimeException e) {
        tx.rollback();
        throw e;
    } finally {
        session.close();
    }
  }
}
