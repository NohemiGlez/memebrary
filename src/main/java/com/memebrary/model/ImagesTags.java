package com.memebrary.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tags_images")
public class ImagesTags {
    @Column(name = "id_image", nullable = false)
    private Long idImage;
    @Column(name = "id_tag", nullable = false)
    private Long idTag;

    public ImagesTags() {
    }

    public ImagesTags(Long idImage, Long idTag) {
        this.idImage = idImage;
        this.idTag = idTag;
    }

    public Long getIdImage() {
        return idImage;
    }

    public void setIdImage(Long idImage) {
        this.idImage = idImage;
    }

    public Long getIdTag() {
        return idTag;
    }

    public void setIdTag(Long idTag) {
        this.idTag = idTag;
    }
}
