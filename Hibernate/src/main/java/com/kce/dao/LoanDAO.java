package com.kce.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.kce.entity.Loan;
import com.kce.util.HibernateUtil;



public class LoanDAO {

    public void save(Loan loan) {
        Transaction tx = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
              session.persist(loan);  
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }
}
