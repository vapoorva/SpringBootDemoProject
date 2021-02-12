package com.av.springproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.av.springproject.domain.Project;
@Repository
public interface ProjectRepository extends CrudRepository<Project, Long>{

}
