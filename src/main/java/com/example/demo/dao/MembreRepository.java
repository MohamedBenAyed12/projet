package com.example.demo.dao;
import com.example.demo.entities.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
@org.springframework.stereotype.Repository
public interface MembreRepository extends JpaRepository<Membre,Long>{
	Membre findByCin(String cin);
	List<Membre>findByNomStartingWith(String caractere);
	Membre findByEmail(String email);
	List<Membre> findByNom(String nom);
	List<Etudiant> findByDiplome(String diplome);
	

}
