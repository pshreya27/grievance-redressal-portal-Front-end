package com.project.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.entity.HODEntity;
import com.project.repository.HODRepository;

@Service
public class HODServices {

    @Autowired
    private HODRepository hodRepository;

    public List<HODEntity> getAllHODs() {
        return hodRepository.findAll();
    }

    public HODEntity getHODById(Long id) {
        return hodRepository.findById(id).orElse(null);
    }

    public HODEntity saveHOD(HODEntity hod) {
        return hodRepository.save(hod);
    }

    public void deleteHOD(Long id) {
        hodRepository.deleteById(id);
    }
}
