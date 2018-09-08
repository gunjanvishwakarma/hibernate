package com.gunjan;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

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

        Item item = new Item("item");
        Bid bid1 = new Bid(10);
        Bid bid2 = new Bid(20);
        bid1.setItem(item);
        bid2.setItem(item);
        List bids = new ArrayList();
        bids.add(bid1);
        bids.add(bid2);
        item.setBids(bids);
        session.save(item);
        List list = session.createCriteria(Bid.class)
                .addOrder(Order.desc("price")).list();
        for (Object obj : list) {
            Bid bid = (Bid) obj;
            System.out.println(bid.getPrice());
        }

        /*
         * Bid bid=new Bid(10); Item item = new Item("item"); bid.setItem(item);
         * session.save(bid);
         */

        tx.commit();
        session.close();

    }

}
