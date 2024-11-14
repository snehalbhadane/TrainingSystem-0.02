package com.yash.trainingsys.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yash.trainingsys.model.Training;

@Service("trainingService")
public interface TrainingService {
	public void addTraining(Training training);
	public List<Training> listTrainings();
	public Training updateTRaining(Long id);
	public void deleteTraining(Long id);

}
