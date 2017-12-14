package goa;

import java.util.List;

public class EmployeeService {
	
	private EmployeeRepository employeeRepository;
	
	public EmployeeService(EmployeeRepository employeeRepository){
		this.employeeRepository = employeeRepository;
	}

	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
	}
	
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		 employeeRepository.save(employee);
				
	}

} 