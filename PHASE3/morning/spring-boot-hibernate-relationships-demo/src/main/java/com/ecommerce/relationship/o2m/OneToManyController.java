package com.ecommerce.relationship.o2m;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Controller
public class OneToManyController {
	@Autowired
	OfficeAddressRepo addessRepo;
	@Autowired
	EmployeeRepo empRepo;

	@GetMapping("/add-address")
	@ResponseBody
	public String index() {
		OfficeAddress addr = new OfficeAddress(2, "HYD, India");
		addessRepo.save(addr);

		Employee emp1 = new Employee(3, "Rajan", addr);
		Employee emp2 = new Employee(4, "Shashikala", addr);

		empRepo.save(emp1);
		empRepo.save(emp2);
		return "added address to 2 employees ";
	}
}

//Entities
@Entity
@Table(name = "employee")
class Employee {

	@Id
	private int empId;
	private String empName;

	// Many employees has one company address
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private OfficeAddress officeAddress;

	public Employee(int empId, String empName, OfficeAddress address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.officeAddress = address;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee []";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public OfficeAddress getAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(OfficeAddress address) {
		this.officeAddress = address;
	}
}

@Entity
@Table(name = "office_address")
class OfficeAddress {

	@Id
	private int addressId;
	private String location;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "officeAddress")
	private List<Employee> employee = new ArrayList<>();

	public OfficeAddress(int addressId, String location) {
		super();
		this.addressId = addressId;
		this.location = location;
	}

	public OfficeAddress() {
		super();
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
}

//// Repositries
@Repository
interface OfficeAddressRepo extends JpaRepository<OfficeAddress, Integer> {

}

@Repository
interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
