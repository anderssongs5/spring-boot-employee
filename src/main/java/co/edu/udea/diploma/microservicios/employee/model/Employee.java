package co.edu.udea.diploma.microservicios.employee.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Employee {

	private Long id;
	private Long organizationId;
	private Long departmentId;
	private String name;
	private int age;
	private String position;

	public Employee(Long organizationId, Long departmentId, String name, int age, String position) {
		this.organizationId = organizationId;
		this.departmentId = departmentId;
		this.name = name;
		this.age = age;
		this.position = position;
	}

}
