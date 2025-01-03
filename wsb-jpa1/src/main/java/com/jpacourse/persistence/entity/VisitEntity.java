package com.jpacourse.persistence.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "VISIT")
public class VisitEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//wiele do jednego, parent to patient
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "patient_id", referencedColumnName = "id")
	private PatientEntity patient;

	public DoctorEntity getDoctor() {
		return doctor;
	}

	public void setDoctor(DoctorEntity doctor) {
		this.doctor = doctor;
	}

	public PatientEntity getPatient() {
		return patient;
	}

	public void setPatient(PatientEntity patient) {
		this.patient = patient;
	}

	//wiele do jednego, parent to doctor
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "doctor_id", referencedColumnName = "id")
	private DoctorEntity doctor;

	public List<MedicalTreatmentEntity> getMedicalTreatments() {
		return MedicalTreatments;
	}

	public void setMedicalTreatments(List<MedicalTreatmentEntity> medicalTreatments) {
		MedicalTreatments = medicalTreatments;
	}

	@OneToMany(mappedBy = "MedicalTreatment")
	private List<MedicalTreatmentEntity> MedicalTreatments;

	private String description;

	@Column(nullable = false)
	private LocalDateTime time;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

}
