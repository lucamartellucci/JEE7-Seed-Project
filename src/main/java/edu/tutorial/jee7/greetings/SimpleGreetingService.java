package edu.tutorial.jee7.greetings;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import org.slf4j.Logger;



@RequestScoped
public class SimpleGreetingService implements GreetingService {
	
	@Inject
	private Logger logger;
	

	public String greet(String name) {
		logger.info("Invoked greet method for the name [{}]", name);
		return new StringBuilder("Hello ").append(name).toString();
	}

}
