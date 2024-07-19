package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.project.entity.RegistrationEntity;
import com.project.services.RegistrationServices;
import java.util.List;

@RestController
@RequestMapping("/registrations")
public class RegistrationController {

    @Autowired
    private RegistrationServices registrationServices;

    @PostMapping("/register")
    public RegistrationEntity registerUser(@RequestBody RegistrationEntity registrationEntity) {
        return registrationServices.saveRegistration(registrationEntity);
    }

    @GetMapping("/all")
    public List<RegistrationEntity> getAllRegistrations() {
        return registrationServices.getAllRegistrations();
    }
}


