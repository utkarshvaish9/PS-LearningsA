package com.ideas.CandidateInfoProject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Candidate {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int candidateId;
	
	private String candidateName;
	private double phoneNo;
	private int experience;
	public Candidate(int candidateId, String candidateName, double phoneNo, int experience) {
		super();
		this.candidateId = candidateId;
		this.candidateName = candidateName;
		this.phoneNo = phoneNo;
		this.experience = experience;
	}
	public Candidate()
	{
		super();
	}
	@Override
	public String toString() {
		return "Candidate [candidateId=" + candidateId + ", candidateName=" + candidateName + ", phoneNo=" + phoneNo
				+ ", experience=" + experience + "]";
	}
	public int getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public double getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(double phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	

	
}
