package dk.easybooking.rest.dto;

import java.util.Date;
import java.util.List;

public class BookingDto {

	private String name;
	private int age;
	private String gender;
	private int weight;
	private List<String> chronicHealthProblems;
	private Date eventDate;
	private Long eventId;
	
	public BookingDto() {
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

	public List<String> getChronicHealthProblems() {
		return chronicHealthProblems;
	}

	public void setChronicHealthProblems(List<String> chronicHealtProblems) {
		this.chronicHealthProblems = chronicHealtProblems;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public Long getEventId() {
		return eventId;
	}
	
	public void setEventId(Long eventId){
		this.eventId = eventId;
	}
	
}
