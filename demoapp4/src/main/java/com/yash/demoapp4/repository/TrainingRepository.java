package com.yash.demoapp4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.yash.demoapp4.model.Training;
@Repository
public interface TrainingRepository extends JpaRepository<Training, Long>{

}

