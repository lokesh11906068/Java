package com.doctorapp.service;

import java.util.List;

import com.doctorapp.dao.DoctorDaoImpl;
import com.doctorapp.dao.IDoctorDao;
import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.model.Doctor;

public class DoctorServiceImpl implements IDoctorService {
	Doctor doctor=new Doctor();
	IDoctorDao iDoctorDao=new DoctorDaoImpl();
	@Override
	public void addDoctor(Doctor doctor) {
		iDoctorDao.addDoctor(doctor);
	}

	@Override
	public void updateDoctor(int doctorId, double fees) {
		 iDoctorDao.updateDoctor(doctorId, fees);
		
	}
	@Override
	public void deleteDoctor(int doctorId) {
		 iDoctorDao.deleteDoctor(doctorId);
		
	}

	@Override
	public Doctor getById(int doctorId) {
		doctor=iDoctorDao.findById(doctorId);
		return doctor;
		
	}

	

	@Override
	public List<Doctor> getAllDoctors() {
		List<Doctor> doctors=iDoctorDao.findAllDoctors();
		if(doctors.isEmpty()) {
			throw new DoctorNotFoundException();
		}
		return doctors;
	}

	@Override
	public List<Doctor> getBySpeciality(String speciality) throws DoctorNotFoundException {
		List<Doctor> doctors=iDoctorDao.findBySpeciality(speciality);
		if(doctors.isEmpty()) {
			throw new DoctorNotFoundException();
		}
		return doctors;
	}

	@Override
	public List<Doctor> getBySpecialityAndExperiance(int experience,String speciality) throws DoctorNotFoundException {
		List<Doctor> doctors=iDoctorDao.findBySpecialityAndExperiance(experience,speciality);
		if(doctors.isEmpty()) {
			throw new DoctorNotFoundException();
		}
		return doctors;
	}

	@Override
	public List<Doctor> getBySpeecialityAndFees(String speciality, double fees) throws DoctorNotFoundException {
		List<Doctor> doctors=iDoctorDao.findBySpeecialityAndFees(speciality,fees);
		if(doctors.isEmpty()) {
			throw new DoctorNotFoundException();
		}
		return doctors;
	}
}


