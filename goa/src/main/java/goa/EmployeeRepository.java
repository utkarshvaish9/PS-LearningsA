package goa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {

	private Connection connection;
	public EmployeeRepository(Connection connection) {
	this.connection = connection;
	}
	public List<Employee> findAll() {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		try {
			ResultSet rs = connection.
							createStatement().
							executeQuery("SELECT Employee_ID,NAME,Company_Employee_ID,"
									+ "Contact_No,Self,Gender,Department FROM Employee");
				while(rs.next())
				{
					Employee employee = new Employee(rs.getString(1),rs.getString(2),
													rs.getString(3),rs.getString(4),rs.getString(5),
													rs.getString(6),rs.getString(7));
					employees.add(employee);
					
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employees;

}
	public Employee findByIds() {
		Employee employee = null;
		try {
			ResultSet rs = connection.
							createStatement().
							executeQuery("SELECT Employee_ID,NAME,Company_Employee_ID,"
									+ "Contact_No,Self,Gender,Department FROM Employee where Employee_ID = 151");
				
				
					employee = new Employee(rs.getString(1),rs.getString(2),
													rs.getString(3),rs.getString(4),rs.getString(5),
													rs.getString(6),rs.getString(7));
					
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee;

}

	
	public void save(Employee employee)
	{
		try {
			String insertQuery = "insert into Employee"
					+ "(Employee_ID,NAME,Company_Employee_ID,Contact_No,Self,Gender,Department)"
					+ "VALUES ('%s','%s','%s','%s','%s','%s','%s')";
			connection.createStatement().executeUpdate(String.format(insertQuery,employee.getEmployeeId(),employee.getName(),
														employee.getCompanyEmployeeId(),employee.getConatactNumber(),
														employee.getSelf(),employee.getGender(),
														employee.getDepartment()));
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void delete(Employee employee)
	{
		try {
			connection.createStatement().executeUpdate("delete from Employee where Employee_ID = " + employee.getEmployeeId() );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void closeConnection() {
		// TODO Auto-generated method stub
			try {
				this.connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
