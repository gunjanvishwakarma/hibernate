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
		/*Item item = new Item("cutter");
		
		session.save(item);
		Bid bid1=new Bid(10);
		Bid bid2=new Bid(15);
		bid1.setItem(item);
		bid2.setItem(item);
		session.save(item);
		session.save(bid1);
		session.save(bid2);*/

        Bid bid = (Bid) session.get(Bid.class, new Long(1));
        tx.commit();
        session.close();
        System.out.println(bid.getItem().getName());


    }

}
