package com.ideas.CandidateInfoProject.service;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ideas.CandidateInfoProject.entity.Candidate;

public class CandidateTest {

	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("CandidateProfile");
	EntityManager entityManager = emfactory.createEntityManager();
	@Before
	public void setup()
	{
		entityManager.getTransaction().begin();
	}
	@After
	public void after()
	{
		entityManager.getTransaction().commit();
		entityManager.close();
		emfactory.close();
	}
	private Candidate createCandidate(int id,String name,double phone,int experience)
	{
		Candidate candidate = new Candidate();
		candidate.setCandidateId(id);
		candidate.setCandidateName(name);
		candidate.setPhoneNo(phone);
		candidate.setExperience(experience);
		 return candidate;
	}
	
	@Test
	public void shouldSaveCandidateList()
	{
		
		
		Candidate candidate1 = createCandidate(15, "a", 123, 1);
		Candidate candidate2 = createCandidate(16, "b", 1235, 11);
		List<Candidate> candidateList = Arrays.asList(candidate1,candidate2);
		for(Candidate candidate: candidateList)
		{
			entityManager.persist(candidate);
		}
		
	}
	@Test
	public void updateCandidate()
	{
		Candidate candidate = entityManager.find(Candidate.class, 1);
		assertEquals("a",candidate.getCandidateName());
		candidate.setPhoneNo(123456);
	}
	@Test
	public void shouldCheckUpdate()
	{
		Candidate candidate = entityManager.find(Candidate.class, 1);
		assertEquals(123456,candidate.getPhoneNo(),0.01);	
		
	}
	@Test
	public void deleteCandidate()
	{
		Candidate candidate = entityManager.find(Candidate.class, 4);
		entityManager.remove(candidate);
	}
	@Test
	public void getAllCandidate()
	{
		List<Candidate> candidates = entityManager.createNativeQuery("select * from Candidate").getResultList();
		assertNotNull(candidates);
	}
	@Test
	public void anyTypeOfQuery()
	{
		Query query = entityManager.createQuery("Select c.candidateName from Candidate c");
		List<String> list = query.getResultList();
		for(String names:list )
		{
			System.out.println(names);
		}
	}
}
