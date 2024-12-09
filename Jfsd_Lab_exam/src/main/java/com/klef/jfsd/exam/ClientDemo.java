package com.klef.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo {
    public static void main(String[] args) {
        // Create SessionFactory
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        // Open Session
        Session session = sessionFactory.openSession();

        // Begin Transaction
        Transaction transaction = session.beginTransaction();

        // Insert Device
        Device device = new Device();
        device.setBrand("Generic Brand");
        device.setModel("Model ");
        device.setPrice(300.0);
        session.save(device);

        // Insert Smartphone
        Smartphone smartphone = new Smartphone();
        smartphone.setBrand("Samsung");
        smartphone.setModel("samsung s20 fe 5g");
        smartphone.setPrice(99999.99);
        smartphone.setOperatingSystem("Android");
        smartphone.setCameraResolution(12);
        session.save(smartphone);

        // Insert Tablet
        Tablet tablet = new Tablet();
        tablet.setBrand("ipad");
        tablet.setModel("iPad 10.9“ (10th generation)");
        tablet.setPrice(19999.99);
        tablet.setScreenSize(15.0);
        tablet.setBatteryLife(90);
        session.save(tablet);

        // Commit Transaction
        transaction.commit();

        // Close Session and Factory
        session.close();
        sessionFactory.close();

        System.out.println("Records inserted successfully.");
    }
}
