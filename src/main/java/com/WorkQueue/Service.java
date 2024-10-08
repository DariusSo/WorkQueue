package com.WorkQueue;

@org.springframework.stereotype.Service
public class Service {

    private final EmailRepository emailRepository;
    private final PictureRepository pictureRepository;

    public Service(EmailRepository emailRepository, PictureRepository pictureRepository) {
        this.emailRepository = emailRepository;
        this.pictureRepository = pictureRepository;
    }

    public void saveEmail(Email email){
        emailRepository.save(email);
    }

    public void savePicture(Picture picture){
        pictureRepository.save(picture);
    }
}
