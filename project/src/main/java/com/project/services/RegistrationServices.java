package com.project.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.RegistrationEntity;
import com.project.repository.RegistrationRepository;

import java.util.List;

@Service
public class RegistrationServices {

    @Autowired
    private RegistrationRepository registrationRepository;

    public RegistrationEntity saveRegistration(RegistrationEntity registrationEntity) {
        return registrationRepository.save(registrationEntity);
    }

    public List<RegistrationEntity> getAllRegistrations() {
        return registrationRepository.findAll();
    }

}
