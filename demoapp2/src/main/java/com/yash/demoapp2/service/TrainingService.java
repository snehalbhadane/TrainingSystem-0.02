package com.yash.demoapp2.service;

import java.util.List;

import com.yash.demoapp2.exceptions.TraningIdNotFoundeXception;
import com.yash.demoapp2.model.Training;



public interface TrainingService {
	public Training addTraining(Training training);
	public List<Training> listTrainings();
	public Training updateTraining(Training training);
	public void deleteTraining(Long id) throws TraningIdNotFoundeXception;

}
