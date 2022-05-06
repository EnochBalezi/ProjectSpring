package com.enochbalezi.project.repository;

import com.enochbalezi.project.entity.Medecin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedecinRepository extends JpaRepository<Medecin, Long> {

}
