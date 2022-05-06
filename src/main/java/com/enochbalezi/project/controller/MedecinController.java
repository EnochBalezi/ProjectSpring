package com.enochbalezi.project.controller;

import java.util.List;

import com.enochbalezi.project.entity.Medecin;
import com.enochbalezi.project.service.MedecinService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedecinController {

    @Autowired
    private MedecinService medecinService;

    @RequestMapping("/")
    public List<Medecin> medecinList() {
        return medecinService.listMedecin();
    }
}
