package com.rhythumitra.util;

public class Queries {
	public static final String createquery="create table vegetable(id integer primary key auto_increment,name varchar(100),price float,origin varchar(100),availability int)";
	public static final String insertQuery="insert into vegetable(name,price,origin,availability) values(?,?,?,?)";
	public static final String updateQuery="update vegetable set name=? where id=?";
	public static final String deleteQuery="delete from vegetable where id=?";
	public static final String query="select * from vegetable";
	public static final String querybyid="select * from vegetable where id=?";
	public static final String querybyname="select * from vegetable where name like ?";
	public static final String querybyprice="select * from vegetable where price=?";
	public static final String querybyorigin="select * from vegetable where origin like ?";
//	public static final String querybyauthorandcategory="select * from book where author=? and category=? ";
	

}
