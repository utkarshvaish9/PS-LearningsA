package com.ideas;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {
	private String breed;
public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
public void makeSound()
{
	System.out.println("CAT meow");
}
}
