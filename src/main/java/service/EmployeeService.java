package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import entities.Employee;
import repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employerepo;
	
	
	public Employee addEmployee(Employee emp)
	{
		Employee resp=employerepo.save(emp);
		return resp;
		
	}

	public List<Employee> getEmployee()
	{
		List<Employee> resp=employerepo.findAll();
		return resp;
		
	}
	
	public Page<Employee> getEmployeewithpagination(int pageNo)
	{
		Pageable page=PageRequest.of(pageNo, 2);
		Page<Employee> resp= employerepo.findAll(page);
		return resp;
		
	}
}
