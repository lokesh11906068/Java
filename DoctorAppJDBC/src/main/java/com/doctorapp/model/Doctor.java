package com.doctorapp.model;

public class Doctor {
	private String doctorName;
	private Integer doctorId;
	private String speciality;
	private double fees;
	private int experience;
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(String doctorName, String speciality, double fees, int experience) {
		super();
		this.doctorName = doctorName;
		this.speciality = speciality;
		this.fees = fees;
		this.experience = experience;
	}
	
	public Doctor(String doctorName, Integer doctorId, String speciality, double fees, int experience) {
		super();
		this.doctorName = doctorName;
		this.doctorId = doctorId;
		this.speciality = speciality;
		this.fees = fees;
		this.experience = experience;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public Integer getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Doctor [doctorName=" + doctorName + ", doctorId=" + doctorId + ", speciality=" + speciality + ", fees="
				+ fees + ", experience=" + experience + "]";
	}
	
}
