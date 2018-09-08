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
        Address billingAddress = new Address("12", "bangalore", "karnataka");
        Address homeAddress = new Address("60", "bangalore", "karnataka");
        User user = new User("Bob");
        billingAddress.setUser(user);
        homeAddress.setUser(user);
        user.setBillingAddress(billingAddress);
        user.setHomeAddress(homeAddress);
        session.save(user);
        tx.commit();


        Transaction tx1 = session.beginTransaction();
        User userFromDataBase = (User) session.get(User.class, new Long(1));
        System.out.println("user name=" + userFromDataBase.getName());
        System.out.println("user homeAddress=" + userFromDataBase.getHomeAddress().getCity());
        System.out.println("user userName=" + userFromDataBase.getHomeAddress().getUser());

        //tx1.commit();
        session.close();


    }

}
