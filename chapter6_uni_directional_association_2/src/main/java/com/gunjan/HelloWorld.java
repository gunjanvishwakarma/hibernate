package com.gunjan;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class HelloWorld {

    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(HelloWorld.class);
        {
            for (int i = 0; i < 10; i++) {
                Session session = HibernateUtil.getSessionFactory().openSession();
                Transaction transaction = session.beginTransaction();
                Item item = new Item("Pen");
                Set bids = new HashSet();
                for (int j = 0; j < 20; j++) {
                    bids.add(new Bid(j));
                }
                item.setBids(bids);
                session.save(item);
                transaction.commit();
                session.close();
            }

        }

        {
            // n + 1 problem
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            List<Item> items = session.createQuery("from Item").list();
            items.forEach(item -> System.out.println(item.getBids()));
            transaction.commit();
            session.close();
        }

    }

}
