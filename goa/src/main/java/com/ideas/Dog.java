package com.ideas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {
	private String breed;
	@Autowired
	@Qualifier("dummyOwner")
	private OwnerInterface ownerInterface;
public OwnerInterface getOwnerInterface() {
		return ownerInterface;
	}
	public void setOwnerInterface(OwnerInterface ownerInterface) {
		this.ownerInterface = ownerInterface;
	}

public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
public void makeSound()
{
	
System.out.println("Dog Barks" + this.breed);	
}

}
