package com.yash.trainingsys.dao;


import java.util.List;

import com.yash.trainingsys.model.Training;

public interface TrainingDAO {
	public void save(Training training);
	public List<Training> list();

}
