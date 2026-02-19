package com.kce.service;

import com.kce.entity.Borrower;
import com.kce.entity.Loan;
import com.kce.entity.Installment;
import com.kce.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Service {

    public boolean addBorrower(Borrower b) {
          Transaction tx = null;
          try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.persist(b);
            tx.commit();
            return true;
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
            return false;
        }
          }

    public boolean addLoan(Loan loan) {
            Transaction tx = null;
          try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.persist(loan);
            tx.commit();
            return true;
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
            return false;
        }
          }
    public boolean addInstallment(Installment inst) {
           Transaction tx = null;
          try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.persist(inst);
            tx.commit();
            return true;
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
            return false;
        }
          }
}
