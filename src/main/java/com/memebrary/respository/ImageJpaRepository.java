package com.memebrary.respository;

import com.memebrary.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageJpaRepository extends JpaRepository<Image, Long> {
    Image findImageByTitle(String title);
}