package com.yash.trainingsys.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.yash.trainingsys.model.Training;
//@Repository
public interface TrainingDAO {
	public void save(Training training);
	public List<Training> list();

}
