package com.yash.demoapp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.yash.demoapp2.model.Training;


@Repository
public interface TrainingRepository extends JpaRepository<Training,Long> {
//Performing CRUD operations
}
