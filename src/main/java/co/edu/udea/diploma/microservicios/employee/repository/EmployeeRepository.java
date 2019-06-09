package co.edu.udea.diploma.microservicios.employee.repository;

import java.util.List;

import co.edu.udea.diploma.microservicios.employee.model.Employee;

public interface EmployeeRepository {

	public Employee add(Employee employee);

	public Employee findById(Long id);

	public List<Employee> findAll();

	public List<Employee> findByDepartment(Long departmentId);

	public List<Employee> findByOrganization(Long organizationId);

}
