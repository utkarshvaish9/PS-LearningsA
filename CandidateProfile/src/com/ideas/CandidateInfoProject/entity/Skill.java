package com.ideas.CandidateInfoProject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Skill {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int skillId;
	
	private String skillName;
	private String type;
	public Skill(int skillId, String skillName, String type) {
		super();
		this.skillId = skillId;
		this.skillName = skillName;
		this.type = type;
	}
	public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Skill [skillId=" + skillId + ", skillName=" + skillName + ", type=" + type + "]";
	}
	public int getSkillId() {
		return skillId;
	}
	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	

}
