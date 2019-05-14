package com.memebrary.controller;

import com.memebrary.model.Image;
import com.memebrary.respository.ImageJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/images")
public class ImagesController {

    private final ImageJpaRepository ImageJpaRepository;

    @Autowired
    public ImagesController(ImageJpaRepository imageJpaRepository) {
        ImageJpaRepository = imageJpaRepository;
    }

    @GetMapping(value = "/all")
    public List<Image> findAll() {
        return ImageJpaRepository.findAll();
    }

    public Image findByTag(@PathVariable final String tag) {
        return  null;
    }
}
