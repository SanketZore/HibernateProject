package hibernateProject;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int DoctorId;

	private String DoctorName;
	
	@Column(name = "Speciality")
	private String DoctorSpeciality;
	
	@OneToMany(mappedBy = "doctor")
	private List<Patient> patientList;
	
	public List<Patient> getPatientList() {
		return patientList;
	}

	public void setPatientList(List<Patient> patientList) {
		this.patientList = patientList;
	}

	public int getDoctorId() {
		return DoctorId;
	}

	public void setDoctorId(int doctorId) {
		DoctorId = doctorId;
	}

	public String getDoctorName() {
		return DoctorName;
	}

	public void setDoctorName(String doctorName) {
		DoctorName = doctorName;
	}

	public String getDoctorSpeciality() {
		return DoctorSpeciality;
	}

	public void setDoctorSpeciality(String doctorSpeciality) {
		DoctorSpeciality = doctorSpeciality;
	}
	
}
