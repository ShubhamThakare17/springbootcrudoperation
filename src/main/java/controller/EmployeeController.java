package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.Employee;
import service.EmployeeService;

@RestController
@CrossOrigin
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("addEmployee")
	public Employee addEmployee(@RequestBody Employee emp)
	{
	Employee resp=employeeService.addEmployee(emp);
		return resp;
		
	}

	@RequestMapping("getEmployee")
	public List<Employee> getEmployee()
	{
	List<Employee> resp=employeeService.getEmployee();
		return resp;
		
	}
	@RequestMapping("getEmployee/{pageNo}")
	public Page<Employee> getEmployeeListwithPaging(@PathVariable("pageNo") int pageNo)
	{
	Page<Employee> resp=employeeService.getEmployeewithpagination(pageNo);
		return resp;
		
	}
}
