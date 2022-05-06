package com.enochbalezi.project.service;

import java.util.List;

import com.enochbalezi.project.entity.Medecin;
import com.enochbalezi.project.repository.MedecinRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedecinServiceImpl implements MedecinService {

    @Autowired
    private MedecinRepository medecinRepository;

    @Override
    public List<Medecin> listMedecin() {
        return medecinRepository.findAll();
    }

}
