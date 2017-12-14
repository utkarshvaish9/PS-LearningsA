package com.ideas;

import org.springframework.stereotype.Component;

@Component
public class Owner implements OwnerInterface {
	private String name;

	public String getName() {
		return "Vodafone";
	}

	public void setName(String name) {
		this.name = name;
	}

}
