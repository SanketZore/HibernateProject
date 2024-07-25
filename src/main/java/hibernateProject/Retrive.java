package hibernateProject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Retrive {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("myPersistenceUnit1");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
//		Doctor doctor=entityManager.find(Doctor.class, 2);
		
//		System.out.println(doctor.getDoctorId()+" "+doctor.getDoctorName()+" "+doctor.getDoctorSpeciality());
		
		Patient patient=entityManager.find(Patient.class,4);
//		System.out.println("Patient "+patient.getPatientName()+" Assigned to Doctor "+patient.getDoctor().getDoctorName());
	
		Doctor doctor=entityManager.find(Doctor.class, 1);
		
		for(Patient p:doctor.getPatientList()) {
			System.out.println(p.getPatientName()+" "+p.getDoctor().getDoctorName());
		}
		
	}

}
