package jsf.entidades;

// Generated 10-jul-2015 18:56:30 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * Departments generated by hbm2java
 */
public class Departments implements java.io.Serializable {

	private int departmentId;
	private Locations locations;
	private Employees employees;
	private String departmentName;
	private Set<JobHistory> jobHistories = new HashSet<JobHistory>(0);
	private Set<Employees> employeeses = new HashSet<Employees>(0);

	public Departments() {
	}

	public Departments(int departmentId, String departmentName) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	public Departments(int departmentId, Locations locations,
			Employees employees, String departmentName,
			Set<JobHistory> jobHistories, Set<Employees> employeeses) {
		this.departmentId = departmentId;
		this.locations = locations;
		this.employees = employees;
		this.departmentName = departmentName;
		this.jobHistories = jobHistories;
		this.employeeses = employeeses;
	}

	public int getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public Locations getLocations() {
		return this.locations;
	}

	public void setLocations(Locations locations) {
		this.locations = locations;
	}

	public Employees getEmployees() {
		return this.employees;
	}

	public void setEmployees(Employees employees) {
		this.employees = employees;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Set<JobHistory> getJobHistories() {
		return this.jobHistories;
	}

	public void setJobHistories(Set<JobHistory> jobHistories) {
		this.jobHistories = jobHistories;
	}

	public Set<Employees> getEmployeeses() {
		return this.employeeses;
	}

	public void setEmployeeses(Set<Employees> employeeses) {
		this.employeeses = employeeses;
	}

}
