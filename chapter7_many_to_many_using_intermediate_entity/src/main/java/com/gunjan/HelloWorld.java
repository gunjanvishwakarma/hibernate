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
		
		/*Category category = new Category("Book");
		Set<Item> item = new HashSet<Item>();
		item.add(new Item("Hibernate"));
		item.add(new Item("Struts"));
		category.setItems(item);
		session.save(category);*/


        Item item = new Item("Hibernate");
        Category category = new Category("Book");
        session.save(item);
        session.save(category);

        CategorizedItem categorizedItem = new CategorizedItem("Bob", item, category);

        session.save(categorizedItem);

        tx.commit();
        session.close();


    }

}
