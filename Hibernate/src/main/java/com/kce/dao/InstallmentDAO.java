package com.kce.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.kce.entity.Installment;
import com.kce.util.HibernateUtil;

public class InstallmentDAO {

    public void save(Installment installment) {
        Transaction tx = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.persist(installment);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }
}

