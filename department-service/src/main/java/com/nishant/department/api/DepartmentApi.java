package com.nishant.department.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nishant.department.entity.Department;
import com.nishant.department.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentApi {
	@Autowired
	private DepartmentService departmentService;
	
	
	@PostMapping("/department")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentService.saveDepartment(department);
	}
	@GetMapping("/department/{departmentId}")
	public Department getDepartment(@PathVariable Long departmentId) {
		return departmentService.getDepartment(departmentId);
	}
}
