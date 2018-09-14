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
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction tx = session.beginTransaction();
            {
            Category category = new Category("Book");
            Set<Item> item = new HashSet<Item>();
            item.add(new Item("Hibernate"));
            item.add(new Item("Struts"));
            category.setItems(item);
            session.save(category);
            }

            Item item = new Item("Hibernate");
            Set<Category> categories = new HashSet<Category>();
            categories.add(new Category("Book"));
            categories.add(new Category("Study"));
            item.setCategories(categories);
            session.save(item);
            tx.commit();
            session.close();
        } catch (HibernateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

       try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction tx = session.beginTransaction();
            //session.delete(session.get(Item.class,1L));
            session.createQuery("delete from Category").executeUpdate();
            tx.commit();
            session.close();
        } catch (HibernateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
