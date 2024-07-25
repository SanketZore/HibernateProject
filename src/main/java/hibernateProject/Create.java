package hibernateProject;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("myPersistenceUnit1");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entiyTransaction=entityManager.getTransaction();
		
		Scanner scanner=new Scanner(System.in); 
		
		
		
		Doctor doctor=new Doctor();
		doctor.setDoctorName("Himanshu");
		doctor.setDoctorSpeciality("Gynecologists");
		Doctor doctor2=new Doctor();
		doctor2.setDoctorName("Shubham");
		doctor2.setDoctorSpeciality("Cardiologists");
		
		
		Patient patient=new Patient();
		patient.setPatientName("Rohan");
		patient.setPatientDesease("HeadAche");
		Patient patient2=new Patient();
		patient2.setPatientName("Chirag");
		patient2.setPatientDesease("Malaria");
		Patient patient3=new Patient();
		patient3.setPatientName("Mohan");
		patient3.setPatientDesease("HeadAche");
		Patient patient4=new Patient();
		patient4.setPatientName("Manish");
		patient4.setPatientDesease("Malaria");
		
		doctor.setPatientList(List.of(patient,patient2));
		doctor2.setPatientList(List.of(patient3,patient4));
		
		patient.setDoctor(doctor);
		patient2.setDoctor(doctor);
		patient3.setDoctor(doctor);
		patient4.setDoctor(doctor2);
		
		
		entiyTransaction.begin();
		entityManager.persist(doctor);
		entityManager.persist(doctor2);
		entityManager.persist(patient);
		entityManager.persist(patient2);
		entityManager.persist(patient3);
		entityManager.persist(patient4);
		entiyTransaction.commit();
		
		
	}

}
