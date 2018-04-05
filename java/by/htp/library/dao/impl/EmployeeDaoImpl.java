package by.htp.library.dao.impl;

import static by.htp.library.dao.util.DataBaseConnectionHelper.connect;
import static by.htp.library.dao.util.DataBaseConnectionHelper.disconnect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import by.htp.library.bean.Book;
import by.htp.library.bean.Employee;
import by.htp.library.bean.Entity;
import by.htp.library.dao.EmployeeDao;

public class EmployeeDaoImpl implements EmployeeDao{

	private static final String SQL_SELECT_EMPLOYEES = "select * from employee";

	public void create(Employee entity) {

	}

	public Employee read(int id) {

		return null;
	}

	public List<Employee> readAll() {
		List<Employee> employees = new ArrayList<Employee>();
		Connection connection = connect();
		
	
			try {
		
			java.sql.Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(SQL_SELECT_EMPLOYEES);
		
			

			while (rs.next()) {
				Employee employee = new Employee();
				employee.setId(rs.getInt("id"));
				employee.setName(rs.getString("name"));
				employee.setSurname(rs.getString("surname"));
				

				employees.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		
		}
		
		disconnect(connection);

		return employees;
	}

	public void update(Employee entity) {

	}

	public void delete(int id) {

	}

	@Override
	public void create(Entity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Entity entity) {
		// TODO Auto-generated method stub
		
	}

}
	
	
	
	

