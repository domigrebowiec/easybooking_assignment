package dk.easybooking.rest.model;

public class Event {

	private Long id;
	private String name;
	private String urlPath;
	
	public Event(Long id, String name, String urlPath) {
		this.id = id;
		this.name = name;
		this.urlPath = urlPath;
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

	public String getUrlPath() {
		return urlPath;
	}

	public void setUrlPath(String urlPath) {
		this.urlPath = urlPath;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", name=" + name + ", urlPath=" + urlPath + "]";
	}
	
	
	
}
