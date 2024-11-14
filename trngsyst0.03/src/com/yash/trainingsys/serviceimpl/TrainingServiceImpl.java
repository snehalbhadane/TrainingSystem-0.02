package com.yash.trainingsys.serviceimpl;

import com.yash.trainingsys.dao.TrainingDAO;
import com.yash.trainingsys.model.Training;
import com.yash.trainingsys.service.TrainingService;

public class TrainingServiceImpl implements TrainingService {
	//setter Injection
	private TrainingDAO trainingDAO;
	/*
	public TrainingServiceImpl(TrainingDAO trainingDAO)
	
	{
		this.trainingDAO=trainingDAO;
	}
	*/
	public void setTrainingDAO(TrainingDAO trainingDAO) {
		this.trainingDAO = trainingDAO;
	}



	@Override
	public void addTraining(Training training) {
		trainingDAO.save(training);
		
		
	}

}
