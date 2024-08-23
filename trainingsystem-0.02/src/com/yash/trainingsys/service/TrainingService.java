package com.yash.trainingsys.service;

import java.util.List;

import com.yash.trainingsys.model.Training;
import com.yash.trainingsys.utilities.Constants;

public interface TrainingService 
{
	public Training getTrainingByID(String id);
	public List<Training> getTrainingByName(String name);
	public List<Training> getTrainingByRequester(String requesterName);
	public void getRequesterList();
	default String getCompanyName()
	{
		return Constants.COMPANY_NAME;
	}
	static List<Training> initTrainings(List<Training> trainingList)
	{
		Training trng1=new Training("1","Java","Java Comp","Java Traning on Web");
		Training trng2=new Training("2","React","UI Comp","React Traning on UI");
		Training trng3=new Training("3","Python","Python Comp","Python Traning on Web");
		trainingList.add(trng1);
		trainingList.add(trng2);
		trainingList.add(trng3);
		return trainingList;
		
	}
}
