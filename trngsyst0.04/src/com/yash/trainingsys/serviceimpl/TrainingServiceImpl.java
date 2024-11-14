package com.yash.trainingsys.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.springframework.stereotype.Service;

import com.yash.trainingsys.dao.TrainingDAO;
import com.yash.trainingsys.model.Training;
import com.yash.trainingsys.service.TrainingService;
@Component
@Service
public class TrainingServiceImpl implements TrainingService {
	//setter Injection
	@Autowired
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
