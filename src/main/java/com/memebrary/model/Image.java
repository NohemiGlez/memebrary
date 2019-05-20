package com.memebrary.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "images")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String title;
    private String image;

    public Image(Long id, String title, String image) {
        this.id = id;
        this.title = title;
        this.image = image;
    }

    public Image(String title, String image) {
        this.title = title;
        this.image = image;
    }

    public Image() {}

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
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
