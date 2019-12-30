package com.example.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.MembreRepository;
import com.example.demo.dao.PublicationRepository;
import com.example.demo.dao.RoleRepository;
import com.example.demo.entities.EnseignantChercheur;
import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Membre;
import com.example.demo.entities.Publication;
import com.example.demo.entities.Role;
import com.example.demo.serviceImpl.MembreImpl;
import com.example.demo.serviceImpl.PublicationImpl;

@SpringBootApplication
public class LaboratoireProjectApplication implements CommandLineRunner{
	@Autowired
	RoleRepository roleRepository;
	@Autowired
	MembreRepository membreRepository;
	@Autowired
	PublicationRepository publicationRepository;
	@Autowired
	MembreImpl membreImpl;
	@Autowired
	PublicationImpl publicationImpl;

	public static void main(String[] args) {
		SpringApplication.run(LaboratoireProjectApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
//		Role r1 = new Role("admin");
//		Role r2 = new Role("user");
//		roleRepository.save(r1);
//		roleRepository.save(r2);
//		Collection<Role> lst1= new ArrayList<Role>();
//		lst1.add(r1);
//
//		Collection<Role> lst2= new ArrayList<Role>();
//		lst2.add(r2);
//		EnseignantChercheur ens1= new EnseignantChercheur("01752354", "Jmaiel", "Mohamed", new Date(), "", null, "jmaiel@enis.tn", "0000");
//		ens1.setRoles(lst1);
//		membreRepository.save(ens1);
//
//		// Ajout d'un membre enseignant chercheur ayant le role user
//		EnseignantChercheur ens2= new EnseignantChercheur("01752354", "mariam", "lahami", new Date(), "", null, "lahami@enis.tn", "2222");
//		ens2.setRoles(lst2);
//		membreRepository.save(ens2);
//
//		// ajout de 3  étudiants 1 mastère et 2 thése ayant le role user
//		Etudiant etd1= new Etudiant("081705454", "ben fekih", "rim", new Date(), "", null, "rim@enis.rn", "11111", null, "test", "these");
//		Etudiant etd2= new Etudiant("885705454", "ben ahmed", "sana", new Date(), "", null, "sana@enis.rn", "11111", null, "test", "mastere");
//		Etudiant etd3= new Etudiant("081454", "chaari", "rim", new Date(), "", null, "chaari@enis.rn", "11111", null, "test", "these");
//		etd1.setRoles(lst2);
//		etd2.setRoles(lst2);
//		etd3.setRoles(lst2);
//		// ens1 est l'encadrant de etd1
//		etd1.setEncadrant(ens1);//requete de mise à jour
//		//ens2 est l'encadrant de etd2
//		etd2.setEncadrant(ens2);//requete de mise à jour
//		membreRepository.save(etd1);
//		membreRepository.save(etd2);
//		membreRepository.save(etd3);
//		Publication pub = new Publication("type_pub",new Date(), "lien pub", "pub.pdf");
//		publicationRepository.save(pub);
//		Publication pub2 = new Publication("type_pub2",new Date(), "lien pub2", "pub2.pdf");
//		publicationRepository.save(pub2);
//		Membre m= membreImpl.findMember(4L);
//		m.setCv("cv1.pdf");
//		membreImpl.updateMember(m);
//		// Delete a Member
//		membreImpl.deleteMember(1L);
		// Ajouter un auteur dans une publication
//		Publication p= publicationImpl.findPubById(1L);
//		Membre m2= membreImpl.findMember(2L);
//		publicationImpl.addAuthor(m,p);
	}
	
	

}
