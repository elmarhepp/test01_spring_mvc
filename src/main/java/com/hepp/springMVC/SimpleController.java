package com.hepp.springMVC;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application.
 */
@Controller
public class SimpleController {
	
	private List<Contact> contacts = new ArrayList<Contact>();	
	
	/**
	 * constructor to fill the contact list
	 */
	public SimpleController(){
		contacts.add(new Contact("Elmar","Hepp"));
		contacts.add(new Contact("Charly","Chaplin"));
		contacts.add(new Contact("Buster", "Keaton"));
	}
	/**
	 * Adds the contact list to the model
	 */
	@RequestMapping
	public void list(Model model) {
		model.addAttribute(contacts);
	}
	
	@RequestMapping
	public void contact(@RequestParam("id") Integer id, Model model){
		model.addAttribute(contacts.get(id));
	}
}
