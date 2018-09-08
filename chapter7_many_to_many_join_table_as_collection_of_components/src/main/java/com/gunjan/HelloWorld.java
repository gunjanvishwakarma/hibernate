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
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        Transaction tx = session.beginTransaction();
		
		/*Category category = new Category("Book");
		Set<Item> item = new HashSet<Item>();
		item.add(new Item("Hibernate"));
		item.add(new Item("Struts"));
		category.setItems(item);
		session.save(category);*/


        Item item = new Item("Hibernate");
        Category category = new Category("Book");
        session.save(item);

        CategorizedItem categorizedItem = new CategorizedItem("Bob", item, category);
        Set<CategorizedItem> categorizedItems = new HashSet<CategorizedItem>();
        categorizedItems.add(categorizedItem);
        category.setCategorizedItems(categorizedItems);

        session.save(category);

        tx.commit();
        session.close();


    }

}
