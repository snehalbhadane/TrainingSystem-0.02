package com.yash.trainingsys.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.yash.trainingsys.daoimpl.TrainingDAoImpl;
import com.yash.trainingsys.serviceimpl.TrainingServiceImpl;

@Configuration
public class TrainingConfig {
	@Bean
    public TrainingDAoImpl daoImpl()
    {
        return new TrainingDAoImpl();
    }
 
    @Bean
    public TrainingServiceImpl serviceImpl()
    {
        return new TrainingServiceImpl();
    }

}
