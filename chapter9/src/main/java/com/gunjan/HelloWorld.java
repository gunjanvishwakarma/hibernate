package com.gunjan;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HelloWorld {

    public static void main(String[] args) throws HibernateException {
        SpringApplication.run(HelloWorld.class);
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        long startTime = System.currentTimeMillis();
        Transaction tx = session.beginTransaction();
        /***************************** Transient State Starts ****************************/
        User user = new User("Bob", "Bob", "mypassword",
                "bob@gmail.com", 1, true, "14th Cross", "560030",
                new Date());
        /***************************** Transient State Ends ****************************/
        Long userId = (Long) session.save(user);
        /***************************** Persistent State Starts ****************************/

        // Any modification between persistent state Hibernate will propagate it
        // to database

        // Below line will fire a SQL update, single or all column will update
        // depends on class level mapping setting in
        // User.hbm.xml(dynamic-insert="true" dynamic-update="true")
        user.setEmail("bob1@gmail.com");

        tx.commit();
        /***************************** Persistent State Ends ****************************/
        session.close();
        /***************************** Detached State Starts ****************************/
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        Session session2 = null;
        try {
            session2 = HibernateUtil.getSessionFactory().openSession();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        Transaction tx2 = session2.beginTransaction();

        // Below repeatable read will fire only one select query, Persistent
        // catch will catch the user object with key as its primary key and
        // return the object from its catch to avoid multiple read of same
        // database row
        User user2 = (User) session2.load(User.class, userId);
        User user3 = (User) session2.load(User.class, userId);
        User user4 = (User) session2.load(User.class, userId);
        System.out.println(user2);

        tx2.commit();
        session2.close();


        // Automatic Dirty Checking
        // transparent transaction level write behind
    }

}
