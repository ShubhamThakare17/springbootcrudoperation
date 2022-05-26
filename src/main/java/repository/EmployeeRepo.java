package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import entities.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>,PagingAndSortingRepository<Employee, Integer> {

	
}
