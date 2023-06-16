package com.ecommerce.relationship.m2m;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Controller
public class ManyToManyDemoController {
	@Autowired
	ProjectRepo projectRepo;
	@Autowired
	StaffRepo staffRepo;

	@GetMapping("/add-sample-project-staff")
	@ResponseBody
	public String addProject() {
		// Let's create some projects with hardcoded names
		// and a staff with hardcoded names.
		// In real projects, you get these from the user
		// by showing a html form and collecting the @requestparam data here.
		Set<Project> projects = new HashSet<Project>();
		projects.add(new Project("ECOM WEBSITE 3"));
		projects.add(new Project("FIBRE CABLING 3"));

		Staff staff1 = new Staff();
		staff1.setFirstName("Shaji 3");
		staff1.setLastName("Kumar 3");
		staff1.setProjects(projects);

		staffRepo.save(staff1);

		return "Saved a staff with two projects. Verify in the database";
	}

	@GetMapping("/add-project-to-staff")
	@ResponseBody
	public String addProjectToStaff(@RequestParam int staffId, @RequestParam int projectId, Model model) {
		// From the staff repo get the Staff obj whose id is staffId.
		// we will get the Staff obj staff1
		// Also get the Project obj from projectRepo. We will get proj1

		// On the staff1, do staff1.getProjects().add(proj1);

		// IMPL BELOW
		Optional<Staff> staffFromRepo = staffRepo.findById(staffId);

		if (staffFromRepo.isPresent()) {
			Staff staff = staffFromRepo.get();

			// get the project
			Optional<Project> projectFromRepo = projectRepo.findById(projectId);
			{
				if (projectFromRepo.isPresent()) {
					Project project = projectFromRepo.get();
					staff.getProjects().add(project);
					
					staffRepo.save(staff);
					return "successfully added project with id=" + projectId + " to the staff id=" + staffId;
				}
			}
		}

		return "something went wrong. Either staff with the staff id does not exist or the proj does not exist";
	}

}

//Entities
@Entity
@Table(name = "Staff")
class Staff {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int staffId;

	String firstName;
	String lastName;

	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "Staff_Project", joinColumns = { @JoinColumn(name = "staff_id") }, inverseJoinColumns = {
			@JoinColumn(name = "project_id") })
	Set<Project> projects = new HashSet<>();

	public Staff() {
		// TODO Auto-generated constructor stub
	}
	
	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}

	// standard constructor/getters/setters

}

@Entity
@Table(name = "Project")
class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int projectId;
	String title;

	@ManyToMany(mappedBy = "projects")
	private Set<Staff> staffs = new HashSet<>();

	public Project() {
		// TODO Auto-generated constructor stub
	}
	public Project(String proj) {
		this.title = proj;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<Staff> getStaffS() {
		return staffs;
	}

	public void setStaffS(Set<Staff> staffs) {
		this.staffs = staffs;
	}

}

//// Repositories
@Repository
interface StaffRepo extends JpaRepository<Staff, Integer> {
}

@Repository
interface ProjectRepo extends JpaRepository<Project, Integer> {
}
