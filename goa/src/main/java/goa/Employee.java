package goa;

public class Employee {
	private String name;
	private String employeeId;
	private String companyEmployeeId;
	private String conatactNumber;
	private String self;
	private String gender;
	private String department;
	
	
	public Employee(String empID, String name, String companyEmployeeId, String conatactNumber, String self,
			String gender, String department) {
		
		this.employeeId = empID;
		this.name = name;
		this.companyEmployeeId = companyEmployeeId;
		this.conatactNumber = conatactNumber;
		this.self = self;
		this.gender = gender;
		this.department = department;
	}
	Employee()
	{
		
	}
	Employee(String name,String  id)
	{
		this.name = name;
		this.employeeId =  id;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	private void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getCompanyEmployeeId() {
		return companyEmployeeId;
	}
	private void setCompanyEmployeeId(String companyEmployeeId) {
		this.companyEmployeeId = companyEmployeeId;
	}
	public String getConatactNumber() {
		return conatactNumber;
	}
	private void setConatactNumber(String conatactNumber) {
		this.conatactNumber = conatactNumber;
	}
	public String getSelf() {
		return self;
	}
	private void setSelf(String self) {
		this.self = self;
	}
	public String getGender() {
		return gender;
	}
	private void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public boolean equals(Object that) {
		if(that==null)
			return false;
		if(this.getClass()!=that.getClass())
			return false;
		if(this==that)
			return true;
		Employee thatEmployee = (Employee) that;
		return this.employeeId.equals(thatEmployee.employeeId) && this.name.equals(thatEmployee.name);
	}
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
	}
