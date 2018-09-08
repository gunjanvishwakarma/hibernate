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
        session1.save(item1);
        Bid bid1 = new Bid(10);
        bid1.setItem(item1);

        Bid bid4 = new Bid(20);
        bid4.setItem(item1);

        Set bids = new HashSet();
        bids.add(bid1);
        bids.add(bid4);

        item1.setBids(bids);

        // Enable cascade save to avoid below lines of code, i.e saving bid
        // instance separately
        session1.save(bid1);
        session1.save(bid4);
        tx1.commit();
        session1.close();

        Session session2 = HibernateUtil.getSessionFactory().openSession();
        Transaction tx2 = session2.beginTransaction();
        Bid bid2 = (Bid) session2.get(Bid.class, new Long(1));
        Item item2 = bid2.getItem();
        System.out.println(item2);
        tx2.commit();
        session2.close();

        Session session3 = HibernateUtil.getSessionFactory().openSession();
        Transaction tx3 = session3.beginTransaction();
        Item item3 = (Item) session3.get(Item.class, new Integer(1));
        System.out.println(item3);
        /*
         * Collection<Bid> bids3 = item3.getBids(); for(Bid bid3 : bids3){
         * System.out.println(bid3); }
         */
        tx3.commit();
        session3.close();

    }

}
