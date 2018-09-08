package com.gunjan;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collection;

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
        Collection bids = new ArrayList();
        bids.add(bid1);
        bids.add(bid1);
        item.setBids(bids);
        session.save(item);
		
		
		
		
		/*Bid bid = new Bid(30);
		bid.setItem(new Item("keyboard"));
		session.save(bid);*/

        tx.commit();
        session.close();


    }

}
