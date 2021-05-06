package com.nishant.department.repository;

import org.springframework.data.repository.CrudRepository;
import com.nishant.department.entity.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long> {

}
