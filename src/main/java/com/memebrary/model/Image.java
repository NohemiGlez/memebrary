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
    private Byte[] image;

    @ManyToMany
    @JoinTable(
        name = "images_tags",
        joinColumns = @JoinColumn(name = "id_image"),
        inverseJoinColumns = @JoinColumn(name = "id_tag"))
    Set<Tag> imagesTags;

    public Image(Long id, String title, Byte[] image) {
        this.id = id;
        this.title = title;
        this.image = image;
    }

    public Image(String title, Byte[] image) {
        this.title = title;
        this.image = image;
    }

    Image() {}

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

    public Byte[] getImage() {
        return this.image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }
}
