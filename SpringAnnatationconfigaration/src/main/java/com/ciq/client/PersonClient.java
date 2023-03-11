package com.ciq.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.controller.PersonController;
import com.ciq.pojo.Person;

public class PersonClient {

	public static void main(String[] args) {

		List<Person> p = new ArrayList<Person>();

		p.add(new Person(1, "kumar", "mncl"));
		p.add(new Person(2, "Sriman", "pdpl"));
		p.add(new Person(3, "pooja", "wrngl"));
		p.add(new Person(5, "ramya", "knr"));
		Person p1 = new Person(3, "sweety", "dgp");

		ApplicationContext con = new ClassPathXmlApplicationContext("annatation.xml");
		PersonController personController = (PersonController) con.getBean("person");

//for (Person person : p) {
//	personController.save(person);
//	
//}
//personController.delete(4);
//		personController.save(p1);

		System.out.println(personController);
	}

}
