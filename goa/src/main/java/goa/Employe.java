package goa;

import javax.persistence.Column;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({
	@NamedQuery(name = "FIND_BY_NAME",query ="select empl from Employe empl "
						+ "where empl.name = :empName")
})

@Entity
@Table(name = "Employee")
public class Employe {
	
	private String name;
	private Integer employeeId;
	private Integer companyEmployeeId;
	private Integer conatactNumber;
	private Boolean self;
	private String gender;
	private String department;
	@Column(name = "NAME")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Id
	@Column(name = "Employee_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	@Column(name = "Company_Employee_ID")
	public Integer getCompanyEmployeeId() {
		return companyEmployeeId;
	}
	public void setCompanyEmployeeId(Integer companyEmployeeId) {
		this.companyEmployeeId = companyEmployeeId;
	}
	@Column(name = "Contact_No")
	public Integer getConatactNumber() {
		return conatactNumber;
	}
	public void setConatactNumber(Integer conatactNumber) {
		this.conatactNumber = conatactNumber;
	}
	@Column(name = "Self")
	public Boolean getSelf() {
		return self;
	}
	public void setSelf(Boolean self) {
		this.self = self;
	}
	@Column(name = "Gender")
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Column(name = "Department")
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}
