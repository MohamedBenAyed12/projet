package com.example.demo.serviceImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PublicationRepository;
import com.example.demo.entities.Membre;
import com.example.demo.entities.Publication;
import com.example.demo.service.IPublicationService;

@Service
public class PublicationImpl implements IPublicationService {
	@Autowired
	PublicationRepository publicationRepository;

	public Publication addPub(Publication m) {
		return publicationRepository.save(m);
	}

	public void deletePub(Long id) {
		publicationRepository.deleteById(id);
	}

	public Publication updatePub(Publication p) {
		return publicationRepository.saveAndFlush(p);
	}

	public Publication findPubById(Long id) {
		return publicationRepository.findById(id).get();
	}

	@Override
	public List<Publication> findAllPub() {
		// TODO Auto-generated method stub
		return publicationRepository.findAll();
	}

	@Override
	public void addAuthor(Membre m, Publication p) {
		Collection<Membre> auteurs = new ArrayList<Membre>();
		auteurs.add(m);

	}

	@Override
	public List<Publication> findPubByDate(Date d) {
		// TODO Auto-generated method stub
		return publicationRepository.findPubByDateApparition(d);
	}

	@Override
	public List<Publication> findPubByType(String type) {
		// TODO Auto-generated method stub
		return publicationRepository.findPubByType(type);
	}
}
