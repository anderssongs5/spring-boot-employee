package co.edu.udea.diploma.microservicios.employee.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.edu.udea.diploma.microservicios.employee.model.Employee;

public interface EmployeeCRUDRepository extends CrudRepository<Employee, String> {

	List<Employee> findByDepartmentId(Long departmentId);
	List<Employee> findByOrganizationId(Long organizationId);

}
