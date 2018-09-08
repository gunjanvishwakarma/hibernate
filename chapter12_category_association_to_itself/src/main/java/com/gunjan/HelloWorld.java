package com.gunjan;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
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

        Category laptops = new Category("Laptops");

        Category hpLaptop = new Category("Laptops-HP");
        hpLaptop.setParentCategory(laptops);

        Category dellLaptop = new Category("Laptops-DELL");
        dellLaptop.setParentCategory(laptops);

        Set childCategories = new HashSet();
        childCategories.add(hpLaptop);
        childCategories.add(dellLaptop);
        laptops.setChildCategories(childCategories);

        session.save(laptops);

        tx.commit();
        session.close();

//		Session session2 = HibernateUtil.getSessionFactory().openSession();
//		Transaction tx2 = session2.beginTransaction();
//		session2.update(laptops);
//		//Category laptops2 =  (Category)session2.load(Category.class, 1L);
//		session2.delete(laptops);
//
//		tx2.commit();
//		session2.close();

//		Session session1 = HibernateUtil.getSessionFactory().openSession();
//		Transaction tx1 = session1.beginTransaction();
//		//Category laptops1 =  (Category)session1.load(Category.class, 1L);
//		//session1.update(laptops2);
//		Category sonyLaptop = new Category("Laptops-Sony");
//		sonyLaptop.setParentCategory(laptops2);
//		
//
//		laptops2.getChildCategories().add(sonyLaptop);
//
//		session1.save(laptops2);
//
//		tx1.commit();
//		session1.close();

        Session session2 = HibernateUtil.getSessionFactory().openSession();
        Transaction tx2 = session2.beginTransaction();
        Query q = session2.createQuery("update Category set name = :newname where name = 'Laptops'");
        q.setString("newname", "Laptops-Category");
        tx2.commit();
        session2.close();

    }

}
