package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EnseignantChercheurRepository;
import com.example.demo.dao.MembreRepository;
import com.example.demo.entities.EnseignantChercheur;
import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Membre;
import com.example.demo.service.IMembreService;
@Service
public class MembreImpl implements IMembreService{
	@Autowired
	MembreRepository membreRepository;
	@Autowired
	EnseignantChercheurRepository enseignantChercheurRepository;

	@Override
	public Membre addMember(Membre m) {
		return membreRepository.save(m);
	}
	@Override
	public void deleteMember(Long id) {
		membreRepository.deleteById(id);
		
	}
	@Override
	public Membre updateMember(Membre p) {
		
		return membreRepository.saveAndFlush(p);
	}
	@Override
	public Membre findMember(Long id) {
		
		return membreRepository.findById(id).get();
	}
	@Override
	public List<Membre> findAll() {
		
		return membreRepository.findAll();
	}
	@Override
	public Membre findByCin(String cin) {
		
		return membreRepository.findByCin(cin);
	}
	@Override
	public Membre findByEmail(String email) {
		// TODO Auto-generated method stub
		return membreRepository.findByEmail(email);
	}
	@Override
	public List<Membre> findByNom(String nom) {
		// TODO Auto-generated method stub
		return membreRepository.findByNom(nom);
	}
	@Override
	public List<Etudiant> findByDiplome(String diplome) {
		// TODO Auto-generated method stub
		return membreRepository.findByDiplome(diplome);
	}
	@Override
	public List<EnseignantChercheur> findByGrade(String grade) {
		// TODO Auto-generated method stub
		return enseignantChercheurRepository.findByGrade(grade);
	}
	@Override
	public List<EnseignantChercheur> findByEtablissement(String etablissement) {
		// TODO Auto-generated method stub
		return enseignantChercheurRepository.findByEtablissement(etablissement);
	}
	

}
