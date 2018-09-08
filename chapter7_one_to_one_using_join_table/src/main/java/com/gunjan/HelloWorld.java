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
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        // creates a Book entity
        Shipment shipment = new Shipment();
        shipment.setState("Karnataka");

        Item item = new Item();
        item.setName("Pen");

        Long itemId = (Long) session.save(item);
        Long shipmentId = (Long) session.save(shipment);

        tx.commit();
        session.close();

        Session session1 = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session1.beginTransaction();
        Item item1 = (Item) session1.get(Item.class, itemId);
        Shipment shipment1 = item1.getShipment();
        System.out.println(item1);
        System.out.println(shipment1);

        tx1.commit();
        session1.close();

    }

}
