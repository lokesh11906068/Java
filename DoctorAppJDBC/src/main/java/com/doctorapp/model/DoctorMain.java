package com.doctorapp.model;

import java.util.List;import java.util.stream.Collector;

import java.util.stream.Collectors;

import com.doctorapp.service.DoctorServiceImpl;
import com.doctorapp.service.IDoctorService;
import com.doctorapp.util.DbConnection;

public class DoctorMain {

	public static void main(String[] args) {
		DbConnection dbConnection=new DbConnection();
		dbConnection.opeConnection();
//		System.out.println("Connection Created");
//		IDoctorService iDoctorService=new DoctorServiceImpl();
		
//		Doctor doctor=new Doctor("Sidda reddy","Farmer",456450.0,23);
		
//		System.out.println( iDoctorService.getById(1));
		//Get All by Sorting
		
//		List<Doctor> doctor=iDoctorService.getAllDoctors().stream()
//					.sorted((d1,d2)->d1.getDoctorName().compareTo(d2.getDoctorName()))
//					.collect(Collectors.toList());	
//		doctor.forEach(System.out::println);
		
		//get by Speciality
		
//		List<Doctor> doctor=iDoctorService.getBySpeciality("Farmer").stream()
//		.sorted((d1,d2)->d1.getDoctorName().compareTo(d2.getDoctorName()))
//		.collect(Collectors.toList());	
//doctor.forEach(System.out::println);
//
//System.out.println("\n");

//List<Doctor> doctor1=iDoctorService.getBySpecialityAndExperiance(10,"psycho").stream()
////.sorted((d1,d2)->d1.getDoctorName().compareTo(d2.getDoctorName()))
//.collect(Collectors.toList());	
//doctor1.forEach(System.out::println);

//System.out.println("\n");
//List<Doctor> doctor2=iDoctorService.getBySpeecialityAndFees("Farmer",5000000).stream()
////.sorted((d1,d2)->d1.getDoctorName().compareTo(d2.getDoctorName()))
//.collect(Collectors.toList());	
//doctor2.forEach(System.out::println);


		
		
		
		
	}
	

}
