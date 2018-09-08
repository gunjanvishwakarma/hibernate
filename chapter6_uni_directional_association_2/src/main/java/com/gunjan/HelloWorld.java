package com.gunjan;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

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

        Bid bid1 = new Bid(10);
        Bid bid2 = new Bid(10);
        session1.save(bid1);
        session1.save(bid2);

        Set bids = new HashSet();
        bids.add(bid1);
        bids.add(bid2);

        item1.setBids(bids);

        session1.save(item1);
        tx1.commit();
        session1.close();

//		Session session2 = HibernateUtil.getSessionFactory().openSession();
//		Transaction tx2 = session2.beginTransaction();
//		Bid bid2 = (Bid) session2.get(Bid.class, new Long(1));
//		Item item2 = bid2.getItem();
//		System.out.println(item2);
//		tx2.commit();
//		session2.close();

    }

}
