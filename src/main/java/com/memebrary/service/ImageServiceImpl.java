package com.memebrary.service;

import com.memebrary.model.Image;
import com.memebrary.respository.ImageJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ImageServiceImpl implements ImageService{
    @Autowired
    private ImageJpaRepository imageJpaRepository;

    public List<Image> findAll() {
        return imageJpaRepository.findAll();
    }

    public Optional<Image> findById(Long id) {
        return imageJpaRepository.findById(id);
    }

    public void save(Image image) {

        imageJpaRepository.save(image);
    }

    public void deleteById(Long id) {
        imageJpaRepository.deleteById(id);
    }

    @Override
    public Image findImageByTitle(String title) {
        return imageJpaRepository.findImageByTitle(title);
    }
}
