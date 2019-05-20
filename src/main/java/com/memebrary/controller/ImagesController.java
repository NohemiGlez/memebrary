package com.memebrary.controller;

import com.memebrary.model.Image;
import com.memebrary.respository.ImageJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(value = "/images")
public class ImagesController {

    private final ImageJpaRepository imageJpaRepository;

    @Autowired
    public ImagesController(ImageJpaRepository imageJpaRepository) {
        this.imageJpaRepository = imageJpaRepository;
    }

    @GetMapping(value = "/all")
    public List<Image> findAll() {
        return imageJpaRepository.findAll();
    }

    @PostMapping(value = "/post")
    public Image addImage(@RequestBody final Image image) {

        imageJpaRepository.save(image);
        return imageJpaRepository.findImageByTitle(image.getTitle());
    }

}
