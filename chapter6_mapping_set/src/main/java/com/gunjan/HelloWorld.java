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
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
        } catch (HibernateException e) {
            e.printStackTrace();
        }

        Transaction tx = session.beginTransaction();

        Item item = new Item("Foo");

        Set<String> images = new HashSet<String>();
        images.add("foo_image_1");
        images.add("foo_image_2");

        item.setImages(images);
        session.save(item);
        tx.commit();
        session.close();

        Session thirdSession = null;
        try {
            thirdSession = HibernateUtil.getSessionFactory().openSession();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        Item itemdb = (Item) thirdSession.get(Item.class,
                new Long(1));

        System.out.println(itemdb);
        thirdSession.close();
        HibernateUtil.shutdown();

    }

}
