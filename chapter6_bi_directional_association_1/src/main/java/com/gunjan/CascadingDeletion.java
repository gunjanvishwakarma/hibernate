package com.gunjan;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class CascadingDeletion {

    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(HelloWorld.class);
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Item item = new Item("Pen");

        Bid bid1 = new Bid(10);
        bid1.setItem(item);

        Bid bid2 = new Bid(20);
        bid2.setItem(item);
        Set bids = new HashSet();
        bids.add(bid1);
        bids.add(bid2);

        item.setBids(bids);
        // If cascading save update is enabled thn saving item will save bid
        // also, and if not thn it will ask to save bid
        session.save(item);

        tx.commit();
        session.close();

        Session session1 = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session1.beginTransaction();
        Item item1 = (Item) session1.get(Item.class, new Integer(1));

        // Deleting Item will delete all associated bids if cascading delete option is enabled
        session1.delete(item1);
        tx1.commit();
        session1.close();

    }

}
