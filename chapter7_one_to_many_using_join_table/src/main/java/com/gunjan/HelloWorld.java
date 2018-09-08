package com.gunjan;

import org.hibernate.HibernateException;
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
     * @throws HibernateException
     */
    public static void main(String[] args) throws HibernateException {
        SpringApplication.run(HelloWorld.class);
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        User user = new User();
        user.setName("Bob");

        Item item1 = new Item();
        item1.setName("Pen");

        Item item2 = new Item();
        item2.setName("Pencil");

        Set<Item> boughtItems = new HashSet<Item>();
        boughtItems.add(item1);
        boughtItems.add(item2);

        user.setBoughtItems(boughtItems);

        session.save(user);

        tx.commit();
        session.close();

    }

}
