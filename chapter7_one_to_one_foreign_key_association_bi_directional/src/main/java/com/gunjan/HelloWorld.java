package com.gunjan;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

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
        Book newBook = new Book();
        newBook.setTitle("Effective Java");
        newBook.setDescription("Best practices for Java programming");
        newBook.setPublishedDate(new Date());

        Author author = new Author("Bob", "bob@gmail.com");

        newBook.setAuthor(author);
        // author.setBook(newBook);
        Long authorId = (Long) session.save(author);
        Long bookId = (Long) session.save(newBook);

        tx.commit();
        session.close();

        Session session1 = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session1.beginTransaction();
        Book book1 = (Book) session1.get(Book.class, bookId);
        Author author1 = book1.getAuthor();
        System.out.println(author1);
        System.out.println(author1.getBook());

        tx1.commit();
        session1.close();

    }

}
