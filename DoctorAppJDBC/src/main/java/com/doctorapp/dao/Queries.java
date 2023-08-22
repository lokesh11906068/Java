package com.doctorapp.dao;

public class Queries {
	public static final String createquery="create table book(title varchar(200),author varchar(100),category varchar(100), bookid int primary key, price float)";
	public static final String insertQuery="insert into book values(?,?,?,?,?)";
	public static final String updateQuery="update book set price=? where bookid=?";
	public static final String deleteQuery="delete from book where bookid=?";
	public static final String query="select * from book";
	public static final String querybyid="select * from book where bookid=?";
	public static final String querybyauthor="select * from book where author=?";
	public static final String querybycategory="select * from book where category=?";
	public static final String querybyprice="select * from book where price<?";
	public static final String querybyauthorandcategory="select * from book where author=? and category=? ";
	

}
