package com.enochbalezi.project.service;

import java.util.List;

import com.enochbalezi.project.entity.Medecin;

import org.springframework.stereotype.Service;

@Service
public interface MedecinService {

    public List<Medecin> listMedecin();
}
