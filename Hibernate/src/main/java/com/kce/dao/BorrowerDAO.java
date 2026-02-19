package com.kce.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.kce.entity.Borrower;
import com.kce.util.HibernateUtil;

public class BorrowerDAO {

    public void save(Borrower borrower) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
              session.persist(borrower);
               tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
              e.printStackTrace();
        }
    }
}
