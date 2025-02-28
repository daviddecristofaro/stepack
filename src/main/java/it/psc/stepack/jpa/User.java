package it.psc.stepack.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private final String name;
	private final String email;

	public User() {
		this.name = "";
		this.email = "";
	}

	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		// User{id=1, name=John, email=john@domain.com}
		return String.format("User{ id=%s, name=%s, email=%s}", this.id, this.name, this.email);
	}

}