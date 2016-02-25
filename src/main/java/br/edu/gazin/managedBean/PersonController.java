package br.edu.gazin.managedBean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.gazin.to.Person;

@ManagedBean
@SessionScoped
public class PersonController {
	private Person person;
	private List<Person> personList;

	@PostConstruct
	public void initialize() {
		personList = new ArrayList<>();
		person = new Person();
	}

	public void addPerson() {
		personList.add(person);
		person = new Person();
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public List<Person> getPersonList() {
		return personList;
	}
}
