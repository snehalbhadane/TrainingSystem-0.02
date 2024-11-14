package com.yash.trainingsys.dao;


import java.util.List;




import com.yash.trainingsys.model.Training;

public interface TrainingDAO 
{
	public void save(Training training);
	public List<Training> list();
	public Training update(Long id);
	public void delete(Long id);

}
//repository--jpa,jdbc template,jpa tenplate,hibernate template