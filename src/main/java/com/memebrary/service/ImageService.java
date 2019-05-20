package com.memebrary.service;

import com.memebrary.model.Image;

public interface ImageService {
    void save(Image image);

    Image findImageByTitle(String title);
}
