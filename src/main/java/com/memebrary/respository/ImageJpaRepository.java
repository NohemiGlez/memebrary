package com.memebrary.respository;

import java.awt.Image;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageJpaRepository extends JpaRepository<Image, Long> {
    Image findImageByTitle(String title);
}