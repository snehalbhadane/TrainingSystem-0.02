package com.yash.trainingsys.daoimpl;

import java.util.List;

//import javax.persistence.Query;
//import javax.persistence.criteria.CriteriaBuilder;
//import javax.persistence.criteria.CriteriaQuery;
//import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;


import com.yash.trainingsys.dao.TrainingDAO;
import com.yash.trainingsys.model.Training;
@Repository
public class TrainingDAoImpl implements TrainingDAO {
	
	@Autowired
	@Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

	public void save(Training training) 
	{
		 Session currentSession = sessionFactory.getCurrentSession();
		 currentSession.saveOrUpdate(training);
		
	}

	public List<Training> list() {
		
		/*Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery <Training> cq = cb.createQuery(Training.class);
        Root<Training> root = cq.from(Training.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        return query.getResultList();
        */
        Session session = sessionFactory.getCurrentSession();
        List<Training> trainingList = session.createQuery("from Training").list();
        return trainingList;
	}

	
		
        
       @Override
   	public Training update(Long id) {
    	   Session session = sessionFactory.getCurrentSession();
   		Training training=session.get(Training.class,id);
          return training;
   	}

       
		
	

	public void delete(Long id) {
		Session session = sessionFactory.getCurrentSession();
        Training training = (Training) session.get(Training.class, new Long(id));
        if(null != training){
            session.delete(training);
		
	}

}
}
	
	
