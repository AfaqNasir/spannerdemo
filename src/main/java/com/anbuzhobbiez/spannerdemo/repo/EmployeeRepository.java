package com.anbuzhobbiez.spannerdemo.repo;

import com.anbuzhobbiez.spannerdemo.model.Employee;
import com.google.cloud.spring.data.spanner.repository.SpannerRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EmployeeRepository extends SpannerRepository<Employee, String> {
}
