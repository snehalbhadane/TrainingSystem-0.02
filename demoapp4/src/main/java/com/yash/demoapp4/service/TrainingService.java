package com.yash.demoapp4.service;

import java.util.List;

import java.util.Optional;

import com.yash.demoapp4.exceptions.NoTrainingFoundException;
import com.yash.demoapp4.exceptions.TrainingIdNotFoundException;
import com.yash.demoapp4.model.Training;


public interface TrainingService {
	public List<Training> getTrainings() throws NoTrainingFoundException;

	//public List<Training> getTraining(long id);

	public Training addTraining(Training training);

	public void deleteTraining(long parseLong) throws TrainingIdNotFoundException;

	public Training updateTraining(Training training);
}
