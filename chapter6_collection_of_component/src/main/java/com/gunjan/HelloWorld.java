package com.gunjan;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Iterator;

@SpringBootApplication
public class HelloWorld {

    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(HelloWorld.class);
        Session newSession = HibernateUtil.getSessionFactory().openSession();
        Transaction newTransaction = newSession.beginTransaction();
		/*Item item = new Item();
		item.setName("Foo");
		Image image1 = new Image();
		image1.setFileName("rose1.jpg");
		image1.setImageName("rose1"); 
		image1.setSizeX(10);
		image1.setSizeY(20);
		
		Image image2 = new Image();
		image2.setFileName("rose2.jpg");
		image2.setImageName("rose2"); 
		image2.setSizeX(100);
		image2.setSizeY(200);
		
		Set<Image> images = new HashSet<Image>();
		images.add(image1);
		images.add(image2);
		item.setImages(images);
		Long msgId=(Long)newSession.save(item);
		newTransaction.commit();
		newSession.close();*/

        Item itemFromDatabase = (Item) newSession.get(Item.class, new Long(1));
        System.out.println(itemFromDatabase.getName());
        for (Iterator iterator = itemFromDatabase.getImages().iterator(); iterator.hasNext(); ) {
            Image loadedImage = (Image) iterator.next();
            System.out.println(loadedImage.getImageName());
        }

    }

}
