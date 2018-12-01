package com.gunjan;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.internal.HEMLogging;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorld {

    /**
     * @param args
     * @throws HibernateException
     */
    public static void main(String[] args) throws HibernateException {
        SpringApplication.run(HelloWorld.class);
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
        } catch (HibernateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        Transaction tx = session.beginTransaction();

        BankAccount bankAccount = new BankAccount("Bob", "citi987655", "CITY", "4");

        session.save(bankAccount);
        tx.commit();
        session.close();


        Session thirdSession = null;
        try {
            thirdSession = HibernateUtil.getSessionFactory().openSession();
        } catch (HibernateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Transaction thirdTransaction = thirdSession.beginTransaction();
        // select m.MESSAGE_ID, m.MESSAGE_TEXT, m.NEXT_MESSAGE_ID from MESSAGES m where m.MESSAGE_ID = 1
        BankAccount account = (BankAccount) thirdSession.get(BankAccount.class, new Long(1));

        System.out.println("account=" + account);
        thirdSession.close();
        HibernateUtil.shutdown();


    }

}
