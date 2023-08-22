package com.doctorapp.service;

import java.util.List;

import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.model.Doctor;

public interface IDoctorService {
	void addDoctor(Doctor doctor);
	void updateDoctor(int doctorId,double fees);
	Doctor getById(int doctorId);
	void deleteDoctor(int doctorId);
	
	List<Doctor> getAllDoctors();
	
	List<Doctor> getBySpeciality(String speciality) throws DoctorNotFoundException;
	List<Doctor> getBySpecialityAndExperiance(int experience,String speciality) throws DoctorNotFoundException;

	List<Doctor> getBySpeecialityAndFees(String speciality,double fees) throws DoctorNotFoundException;

	
}
