package com.rhythumitra.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.rhythumitra.client.Vegetable;
import com.rhythumitra.util.DBConnection;
import com.rhythumitra.util.Queries;

public class VegetableDaoImpl implements IVegetableDao {

	@Override
	public void addVegetable(Vegetable vegetable) {
		try(Connection connection=DBConnection.opeConnection();
				PreparedStatement preparedStatement=connection.prepareStatement(Queries.insertQuery);){
			preparedStatement.setString(1, vegetable.getName());
			preparedStatement.setDouble(2, vegetable.getPrice());
			preparedStatement.setString(3, vegetable.getOrigin());
			preparedStatement.setInt(4, vegetable.getAvailability());
			preparedStatement.execute();
			
			System.out.println("row Inserted");

		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateVegetable(String name, int id) {
		try(Connection connection=DBConnection.opeConnection();
				PreparedStatement preparedStatement=connection.prepareStatement(Queries.updateQuery);){
			preparedStatement.setString(1,name);
			preparedStatement.setInt(2, id);
			preparedStatement.execute();
			
			System.out.println("row Updated");

		}catch (Exception e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void deleteVegetable(int id) {
		try(Connection connection=DBConnection.opeConnection();
				PreparedStatement preparedStatement=connection.prepareStatement(Queries.deleteQuery);){
			preparedStatement.setInt(1, id);
			preparedStatement.execute();
			
			

		}catch (Exception e) {
			e.printStackTrace();
		}		
	}

	@Override
	public List<Vegetable> findAllVegetables() {
		List<Vegetable> vegetables=new ArrayList<>();
		try(Connection connection=DBConnection.opeConnection();
				PreparedStatement preparedStatement=connection.prepareStatement(Queries.query);){
			preparedStatement.execute();
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
//				Integer id=resultSet.getInt("id");
				String name=resultSet.getString("name");
				double price=resultSet.getDouble("price");
				String origin=resultSet.getString("origin");
				int availability=resultSet.getInt("availability");
				
				Vegetable vegetable=new Vegetable(name,price,origin,availability);
				vegetables.add(vegetable);
			}

		}catch (Exception e) {
			e.printStackTrace();
		}
		return vegetables;
		
	}

	@Override
	public Vegetable findById(int id) {
		Vegetable vegetable=new Vegetable();
		try(Connection connection=DBConnection.opeConnection();
				PreparedStatement preparedStatement=connection.prepareStatement(Queries.querybyid);){
			preparedStatement.setInt(1, id);
			preparedStatement.execute();
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Integer id1=resultSet.getInt("id");
				String name=resultSet.getString("name");
				double price=resultSet.getDouble("price");
				String origin=resultSet.getString("origin");
				int availability=resultSet.getInt("availability");
				
				 vegetable=new Vegetable(id1,name,price,origin,availability);
				
			}

		}catch (Exception e) {
			e.printStackTrace();
		}
		return vegetable;
	}

	@Override
	public List<Vegetable> findByName(String name) {
		List<Vegetable> vegetables=new ArrayList<>();
		try(Connection connection=DBConnection.opeConnection();
				PreparedStatement preparedStatement=connection.prepareStatement(Queries.querybyname);){
			preparedStatement.setString(1,"%"+name+"%");

			preparedStatement.execute();
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Integer id=resultSet.getInt("id");
				String name1=resultSet.getString("name");
				double price=resultSet.getDouble("price");
				String origin=resultSet.getString("origin");
				int availability=resultSet.getInt("availability");
				
				Vegetable vegetable=new Vegetable(id,name1,price,origin,availability);
				vegetables.add(vegetable);
			}

		}catch (Exception e) {
			e.printStackTrace();
		}
		return vegetables;
	}

	@Override
	public List<Vegetable> findByPrice(double price) {
		List<Vegetable> vegetables=new ArrayList<>();
		try(Connection connection=DBConnection.opeConnection();
				PreparedStatement preparedStatement=connection.prepareStatement(Queries.querybyprice);){
			preparedStatement.setDouble(1,price);

			preparedStatement.execute();
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Integer id=resultSet.getInt("id");
				String name=resultSet.getString("name");
				double price1=resultSet.getDouble("price");
				String origin=resultSet.getString("origin");
				int availability=resultSet.getInt("availability");
				
				Vegetable vegetable=new Vegetable(id,name,price1,origin,availability);
				vegetables.add(vegetable);
			}

		}catch (Exception e) {
			e.printStackTrace();
		}
		return vegetables;
	}

	@Override
	public List<Vegetable> findByOrigin(String origin) {
		List<Vegetable> vegetables=new ArrayList<>();
		try(Connection connection=DBConnection.opeConnection();
				PreparedStatement preparedStatement=connection.prepareStatement(Queries.querybyorigin);){
			preparedStatement.setString(1,"%"+origin+"%");

			preparedStatement.execute();
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Integer id=resultSet.getInt("id");
				String name=resultSet.getString("name");
				double price=resultSet.getDouble("price");
				String origin1=resultSet.getString("origin");
				int availability=resultSet.getInt("availability");
				Vegetable vegetable=new Vegetable(id,name,price,origin1,availability);
				vegetables.add(vegetable);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return vegetables;
	}

	

}
