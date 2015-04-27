package org.elsys.musicforum.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity(name="Post")
@NamedQueries({
	@NamedQuery(name = "allPosts", query = "SELECT p from Post p")
})

public class Post {
	@Id
	@GeneratedValue
	private long id;
	@Column(nullable = false, length=50)
	private User createdBy;
	@Column(nullable = false, length=50)
	private String createdAt;
	@Column(nullable = false)
	private boolean isLooking;
	@Column(nullable = false, length=50)
	private long instrumentId;
	@Column(nullable = false, length=50)
	private String city;
	@Column(nullable = false, length=50)
	private String title;
	@Column(nullable = false, length=50)
	private String body;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public User getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public boolean getIsLooking() {
		return isLooking;
	}
	public void setLooking(boolean l) {
		this.isLooking = l;
	}
	public long getInstrumentId() {
		return instrumentId;
	}
	public void setInstrumentId(long instrumentId) {
		this.instrumentId = instrumentId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	
	
	
}