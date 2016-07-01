package dk.easybooking.rest.model;

import java.util.List;

public class Booking {

	private Long id;
	private String name;
	private int age;
	private String gender;
	private int weight;
	private List<String> chronicHealtProblems;
	private EventOnDate event;
	
	public Booking(String name, int age, String gender, int weight, List<String> chronicHealtProblems, EventOnDate event) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.weight = weight;
		this.chronicHealtProblems = chronicHealtProblems;
		this.event = event;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public List<String> getChronicHealtProblems() {
		return chronicHealtProblems;
	}
	public void setChronicHealtProblems(List<String> chronicHealtProblems) {
		this.chronicHealtProblems = chronicHealtProblems;
	}
	public EventOnDate getEvent() {
		return event;
	}
	public void setEvent(EventOnDate event) {
		this.event = event;
	}

	@Override
	public String toString() {
		return "Booking [name=" + name + ", age=" + age + ", gender=" + gender + ", weight=" + weight
				+ ", chronicHealtProblems=" + chronicHealtProblems + ", event=" + event + "]";
	}
	
	
}
