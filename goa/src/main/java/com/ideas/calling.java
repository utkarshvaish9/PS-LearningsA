package com.ideas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class calling {
	public static void main(String args[])
	{
		/*Animal animal = new Dog();
		animal.makeSound();
		animal = new Cat();
		animal.makeSound();*/
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//Animal dog = (Dog)context.getBean("dog");
		//dog.makeSound();
		//Animal cat = (Cat)context.getBean("cat");
		//cat.makeSound();
		Dog dogy = (Dog)context.getBean("dog");
		dogy.makeSound();
		System.out.println(dogy.getOwnerInterface().getName());
	}

}
