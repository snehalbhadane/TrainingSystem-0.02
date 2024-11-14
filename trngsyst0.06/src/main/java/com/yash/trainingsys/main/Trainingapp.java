package com.yash.trainingsys.main;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.yash.trainingsys.config.TrainingAppConfiguration;
import com.yash.trainingsys.config.WebContext;
import com.yash.trainingsys.config.WebInitializer;
import com.yash.trainingsys.model.Training;
import com.yash.trainingsys.service.TrainingService;
import com.yash.trainingsys.serviceimpl.TrainingServiceImpl;

public class Trainingapp {

	public static void main(String[] args) {
		/*ApplicationContext ctx=new AnnotationConfigApplicationContext(TrainingConfig.class);
		TrainingService service=(TrainingService) ctx.getBean(TrainingServiceImpl.class);
		Training trng=new Training();
		trng.setId(1);
		trng.setName("Java");
		trng.setRequesterName("Java Comp");
		service.addTraining(trng);
		System.out.println("Training added succesfully");
		
		  
*/
		ApplicationContext ctx=new AnnotationConfigApplicationContext(WebContext.class,TrainingAppConfiguration.class);
		System.out.println("Database connected");
		TrainingService trainingService=ctx.getBean(TrainingService.class);
	}

}
