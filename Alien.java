package in.telusko.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.annotations.Table;

@Entity
@javax.persistence.Table(name="Alien_Table")
public class Alien {
    @Id
	private int id;
	private AlienName name;
	private int age;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AlienName getName() {
		return name;
	}

	public void setName(AlienName name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
