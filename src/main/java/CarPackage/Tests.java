package CarPackage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Date;

public class Tests {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();



        try{
            entityTransaction.begin();

            //StudentsEntity studentsentity = new StudentsEntity();

            Booking booking = new Booking();

            Date date = new Date();

            booking.setBookingId(7);
            booking.setCarId(2023);
            booking.setCustomerId(24);
            booking.setPickUpDate(date);
            booking.setDropOffDate(date);
            booking.setRealDropOffDate(date);

            entityManager.persist(booking);

            entityTransaction.commit();

        } finally {
            if(entityTransaction.isActive()){
                entityTransaction.rollback();
            }
            entityManager.close();
            entityManagerFactory.close();
        }
    }

}
