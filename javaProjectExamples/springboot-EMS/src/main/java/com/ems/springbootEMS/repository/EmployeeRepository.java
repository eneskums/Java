package com.ems.springbootEMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ems.springbootEMS.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
