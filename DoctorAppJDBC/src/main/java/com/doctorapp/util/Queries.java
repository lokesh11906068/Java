package com.doctorapp.util;

public class Queries {
	public static final String createquery="create table doctor(doctorName varchar(200),doctorId integer primary key auto_increment,speciality varchar(100),fees double, experience int)";
	public static final String InsertQuery="insert into doctor(doctorName,speciality,fees,experience) values(?,?,?,?)";
	public static final String updateQuery="update doctor set fees=? where doctorId=?";
	public static final String deleteQuery="delete from doctor where doctorId=?";
	public static final String query="select * from doctor";
	public static final String querybyid="select * from doctor where doctorId=?";
	public static final String querybydoctorName="select * from doctor where doctorName=?";
	public static final String querybyspeciality="select * from doctor where speciality=?";
	public static final String querybySpecialityAndfees="select * from doctor where speciality=? and fees<? ";
	public static final String querybyExperienceandspeciality="select * from doctor where experience=? or speciality=? ";
	

}
