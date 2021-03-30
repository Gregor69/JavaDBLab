package codeclan.com.example.Staffservice;

import codeclan.com.example.Staffservice.models.Department;
import codeclan.com.example.Staffservice.models.Employee;
import codeclan.com.example.Staffservice.models.Project;
import codeclan.com.example.Staffservice.repositories.DepartmentRepository;
import codeclan.com.example.Staffservice.repositories.EmployeeRepository;
import codeclan.com.example.Staffservice.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StaffserviceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Department department = new Department("Claims");
		departmentRepository.save(department);
		Employee henry = new Employee("Henry", "Nuggs", 3657, department);
		employeeRepository.save(henry);
		Employee alfie = new Employee("Alfie", "Chonk", 2835, department);
		employeeRepository.save(alfie);
		Project project = new Project("Dogs in cars", 7);
		projectRepository.save(project);
		project.addEmployeeToProject(henry);
		projectRepository.save(project);


	}

}
