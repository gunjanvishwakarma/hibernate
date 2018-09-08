package com.gunjan;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorld {

    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(HelloWorld.class);
        Session session1 = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session1.beginTransaction();
        Item item1 = new Item("Pen");
        session1.save(item1);
        Bid bid1 = new Bid(10);
        bid1.setItem(item1);
        session1.save(bid1);
        tx1.commit();
        session1.close();

        Session session2 = HibernateUtil.getSessionFactory().openSession();
        Transaction tx2 = session2.beginTransaction();
        Bid bid2 = (Bid) session2.get(Bid.class, new Long(1));
        Item item2 = bid2.getItem();
        System.out.println(item2);
        tx2.commit();
        session2.close();

    }

}
