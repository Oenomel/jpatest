package test.service;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Service;

import test.entity.City;
import test.persistence.PersistenceManager;

@Service
public class TestService {
	public void doService() {
		createData();
	}
	
	private void createData() {
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
		
		City city = new City();
		city.setName("New York");
		city.setPopulation(new Integer(10000));
		
		em.persist(city);
		em.getTransaction().commit();
		em.close();
	}
}
