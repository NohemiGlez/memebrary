package com.memebrary.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "images")
public class Image {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String title;
	private String image;
	@OneToOne
	@JoinColumn(name = "id_user")
	private User user;

	Image() {}

	public Image(String title, String image) {
		super();
		this.title = title;
		this.image = image;
	}

	public Image(Long id, String title, String image) {
		super();
		this.id = id;
		this.title = title;
		this.image = image;
	}

	public Image(Long id, String title, String image, User user) {
		super();
		this.id = id;
		this.title = title;
		this.image = image;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
