package org.elsys.musicforum.model;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class User {
	private long id;
	private String email;
	private String username;
	private String registeredAt;
	private String password;
	private String sex;
	private Role role;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRegisteredAt() {
		return registeredAt;
	}
	public void setRegisteredAt(String registeredAt) {
		this.registeredAt = registeredAt;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
}