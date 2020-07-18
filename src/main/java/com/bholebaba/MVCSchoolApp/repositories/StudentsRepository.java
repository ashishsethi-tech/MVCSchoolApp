package com.bholebaba.MVCSchoolApp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bholebaba.MVCSchoolApp.entities.Students;

@Repository
public interface StudentsRepository extends CrudRepository<Students, Integer> {

}
