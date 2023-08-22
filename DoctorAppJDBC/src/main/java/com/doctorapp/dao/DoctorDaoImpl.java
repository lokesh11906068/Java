package com.doctorapp.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.util.DbConnection;
import com.doctorapp.util.Queries;

public  class DoctorDaoImpl implements IDoctorDao {

	@Override
	public void addDoctor(Doctor doctor) {
		try(Connection connection=DbConnection.opeConnection();
				PreparedStatement preparedStatement=connection.prepareStatement(Queries.InsertQuery);){
			preparedStatement.setString(1, doctor.getDoctorName());
			preparedStatement.setString(2, doctor.getSpeciality());
			preparedStatement.setDouble(3, doctor.getFees());
			preparedStatement.setInt(4, doctor.getExperience());

			preparedStatement.execute();
			System.out.println("row Inserted");

		}catch (Exception e) {
			e.printStackTrace();
		}
		}
	

	@Override
	public void updateDoctor(int doctorId, double fees) {
		try(Connection connection=DbConnection.opeConnection();
				PreparedStatement preparedStatement=connection.prepareStatement(Queries.updateQuery);){
			preparedStatement.setDouble(1, fees);

			preparedStatement.setInt(2, doctorId);
			

			preparedStatement.execute();
			System.out.println("row Inserted");

		}catch (Exception e) {
			e.printStackTrace();
		}
		}
	
	@Override
	public void deleteDoctor(int doctorId) {
		try(Connection connection=DbConnection.opeConnection();
				PreparedStatement preparedStatement=connection.prepareStatement(Queries.deleteQuery);){
			preparedStatement.setInt(1, doctorId);
			preparedStatement.execute();
			System.out.println("Row Deleted");

		}catch (Exception e) {
			e.printStackTrace();
		}
		}
		
	

	@Override
	public Doctor findById(int doctorId) {
		Doctor doctor=new Doctor();
		try(Connection connection=DbConnection.opeConnection();
				PreparedStatement preparedStatement=connection.prepareStatement(Queries.querybyid);){
			preparedStatement.setInt(1, doctorId);
			preparedStatement.execute();
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				String doctorName=resultSet.getString("doctorName");
				Integer doctorId1=resultSet.getInt("doctorId");
				String speciality=resultSet.getString("speciality");
				double fees=resultSet.getDouble("fees");
				int experience=resultSet.getInt("experience");
				
				 doctor.setDoctorName(doctorName);
				 doctor.setDoctorId(doctorId1);
				 doctor.setSpeciality(speciality);
				 doctor.setFees(fees);
				 doctor.setExperience(experience);

			}

		}catch (Exception e) {
			e.printStackTrace();
		}
		return doctor;
		}
	

	

	@Override
	public List<Doctor> findAllDoctors() {
		List<Doctor> doctors=new ArrayList<Doctor>();
		try(Connection connection=DbConnection.opeConnection();
				PreparedStatement preparedStatement=connection.prepareStatement(Queries.query);){
			
			preparedStatement.execute();
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				String doctorName=resultSet.getString("doctorName");
				Integer doctorId1=resultSet.getInt("doctorId");
				String speciality=resultSet.getString("speciality");
				double fees=resultSet.getDouble("fees");
				int experience=resultSet.getInt("experience");
				Doctor doctor=new Doctor(doctorName,doctorId1,speciality,fees,experience);
				doctors.add(doctor);
			}

		}catch (Exception e) {
			e.printStackTrace();
		}
		return doctors;
		}
	

	@Override
	public List<Doctor> findBySpeciality(String speciality) throws DoctorNotFoundException {
		List<Doctor> doctors=new ArrayList<Doctor>();
		try(Connection connection=DbConnection.opeConnection();
				PreparedStatement preparedStatement=connection.prepareStatement(Queries.querybyspeciality);){
			preparedStatement.setString(1, speciality);
			preparedStatement.execute();
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				String doctorName=resultSet.getString("doctorName");
				Integer doctorId1=resultSet.getInt("doctorId");
				String speciality1=resultSet.getString("speciality");
				double fees=resultSet.getDouble("fees");
				int experience=resultSet.getInt("experience");
				Doctor doctor=new Doctor(doctorName,doctorId1,speciality1,fees,experience);
				doctors.add(doctor);
			}

		}catch (Exception e) {
			e.printStackTrace();
		}
		return doctors;
		}

	@Override
	public List<Doctor> findBySpecialityAndExperiance(int experience,String speciality)
			throws DoctorNotFoundException {
		List<Doctor> doctors=new ArrayList<Doctor>();
		try(Connection connection=DbConnection.opeConnection();
				PreparedStatement preparedStatement=connection.prepareStatement(Queries.querybyExperienceandspeciality);){
			preparedStatement.setInt(1, experience);
			preparedStatement.setString(2, speciality);
			
			preparedStatement.execute();
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				String doctorName=resultSet.getString("doctorName");
				Integer doctorId1=resultSet.getInt("doctorId");
				String speciality1=resultSet.getString("speciality");
				double fees=resultSet.getDouble("fees");
				int experience1=resultSet.getInt("experience");
				Doctor doctor=new Doctor(doctorName,doctorId1,speciality1,fees,experience1);
				doctors.add(doctor);
			}

		}catch (Exception e) {
			e.printStackTrace();
		}
		return doctors;
		}

	@Override
	public List<Doctor> findBySpeecialityAndFees(String speciality, double fees) throws DoctorNotFoundException {
		List<Doctor> doctors=new ArrayList<Doctor>();
		try(Connection connection=DbConnection.opeConnection();
				PreparedStatement preparedStatement=connection.prepareStatement(Queries.querybySpecialityAndfees);){
			preparedStatement.setString(1, speciality);
			preparedStatement.setDouble(2, fees);
			preparedStatement.execute();
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				String doctorName=resultSet.getString("doctorName");
				Integer doctorId1=resultSet.getInt("doctorId");
				String speciality1=resultSet.getString("speciality");
				double fees1=resultSet.getDouble("fees");
				int experience1=resultSet.getInt("experience");
				Doctor doctor=new Doctor(doctorName,doctorId1,speciality1,fees1,experience1);
				doctors.add(doctor);
			}

		}catch (Exception e) {
			e.printStackTrace();
		}
		return doctors;
		}
	
}
