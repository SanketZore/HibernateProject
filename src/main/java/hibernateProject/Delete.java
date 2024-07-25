package hibernateProject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("myPersistenceUnit1");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Doctor doctor=entityManager.find(Doctor.class,2);
		
		
		entityTransaction.begin();
		entityManager.remove(doctor);
		entityTransaction.commit();
		
	}

}
