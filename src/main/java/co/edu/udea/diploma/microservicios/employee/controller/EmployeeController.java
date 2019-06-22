package co.edu.udea.diploma.microservicios.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.udea.diploma.microservicios.employee.model.Employee;
import co.edu.udea.diploma.microservicios.employee.repository.EmployeeCRUDRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	EmployeeCRUDRepository repository;

	@PostMapping("/")
	public ResponseEntity<Employee> add(@RequestBody Employee employee) {
		log.info("Adding employee: {}", employee);
		return ResponseEntity.ok(repository.save(employee));
	}

	@GetMapping("/{id}")
	public Employee findById(@PathVariable("id") String id) {
		log.info("Employee find: id = {}", id);
		return repository.findById(id).get();
	}

	@GetMapping("/")
	public ResponseEntity<Iterable<Employee>> findAll() {
		log.info("Getting all employees");
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/department/{departmentId}")
	public ResponseEntity<List<Employee>> findByDepartment(@PathVariable("departmentId") Long departmentId) {
		log.info("Finding by department {}", departmentId);
		return ResponseEntity.ok(repository.findByDepartmentId(departmentId));
	}

	@GetMapping("/organization/{organizationId}")
	public ResponseEntity<List<Employee>> findByOrganization(@PathVariable("organizationId") Long organizationId) {
		log.info("Finding by organization {}", organizationId);
		return ResponseEntity.ok(repository.findByOrganizationId(organizationId));
	}
}
