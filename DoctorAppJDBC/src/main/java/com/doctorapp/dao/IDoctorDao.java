package com.doctorapp.dao;

import java.util.List;

import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.model.Doctor;

public interface IDoctorDao {
	void addDoctor(Doctor doctor);
	void updateDoctor(int doctorId,double fees);
	
	void deleteDoctor(int doctorId);
	
	Doctor findById(int doctorId);
	
	List<Doctor> findAllDoctors();
	
	List<Doctor> findBySpeciality(String speciality) throws DoctorNotFoundException;
	List<Doctor> findBySpecialityAndExperiance(int experience,String speciality) throws DoctorNotFoundException;

	List<Doctor> findBySpeecialityAndFees(String speciality,double fees) throws DoctorNotFoundException;


}
