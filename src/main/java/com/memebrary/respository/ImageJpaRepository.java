package com.memebrary.respository;

import com.memebrary.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageJpaRepository extends JpaRepository<Image, Long> {
    Image findImageByTitle(String title);
}