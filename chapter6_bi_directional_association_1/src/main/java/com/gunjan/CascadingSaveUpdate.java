package com.gunjan;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CascadingSaveUpdate {

    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(HelloWorld.class);
        // Session session = HibernateUtil.getSessionFactory().openSession();
        // Transaction tx = session.beginTransaction();
        // Item item = new Item("Pen");
        //
        // Bid bid1 = new Bid(10);
        // bid1.setItem(item);
        //
        // Bid bid2 = new Bid(20);
        // bid2.setItem(item);
        // Set bids = new HashSet();
        // bids.add(bid1);
        // bids.add(bid2);
        //
        // item.setBids(bids);
        // If cascading save update is enabled thn saving item will save bid
        // also, and if not thn it will ask to save bid
        // session.save(item);
        //
        // tx.commit();
        // session.close();

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Item item = new Item("Pen");

        Bid bid1 = new Bid(10);
        bid1.setItem(item);

        Bid bid2 = new Bid(20);
        bid2.setItem(item);

        // If cascading save update is enabled thn saving bid will save item
        // also, and if not thn it will ask to save item
        session.save(bid1);
        session.save(bid2);
        tx.commit();
        session.close();

    }

}
