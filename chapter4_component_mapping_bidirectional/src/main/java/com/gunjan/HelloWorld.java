package com.gunjan;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
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
        Address billingAddress = new Address("12", "bangalore", "karnataka");
        Address homeAddress = new Address("60", "bangalore", "karnataka");

        User user = new User("bob");

        user.setBillingAddress(billingAddress);
        user.setHomeAddress(homeAddress);
        Long userId = (Long) session.save(user);
        tx.commit();
        session.close();


        Session session1 = null;
        try {
            session1 = HibernateUtil.getSessionFactory().openSession();
        } catch (HibernateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        Transaction tx1 = session1.beginTransaction();

        User user1 = (User) session1.get(User.class, userId);

        // Below code is possible because of bidirectional mapping in User.hbm.xml
        System.out.println(user1.getBillingAddress().getUser().getName());
        tx1.commit();
        session1.close();


    }

}
