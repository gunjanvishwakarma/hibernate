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
        //Item item = (Item)session.get(Item.class,new Long(1));
        //session.delete(item);
        Item item = new Item("item");
        session.save(item);
        tx.commit();
        session.close();
		
		
		/*Bid bid1=new Bid(10);
		bid1.setItem(item);
		Set bids = new HashSet();
		bids.add(bid1);*/

        //item.setBids(bids);
        //session.save(item);
        //session.save(bid1);
        //session.save(bid2);
	
		/*Bid bid=new Bid(10);
		bid.setItem(item);
		session.save(bid);
		*/
		/*
		With inverse  = "true"
		Hibernate: insert into ITEM (NAME) values (?)
		Hibernate: insert into BID (AMOUNT, ITEM_ID) values (?, ?)
		*/
		
		/*
		Without inverse="true"
		Hibernate: insert into ITEM (NAME) values (?)
		Hibernate: insert into BID (AMOUNT, ITEM_ID) values (?, ?)
		Hibernate: update BID set ITEM_ID=? where BID_ID=?
		*/


    }

}
