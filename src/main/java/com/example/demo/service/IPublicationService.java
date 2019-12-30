package com.example.demo.service;

import java.util.Date;
import java.util.List;

import com.example.demo.entities.Membre;
import com.example.demo.entities.Publication;

public interface IPublicationService {
	//CRUD
	public Publication addPub(Publication m);
	public void deletePub (Long id) ;
	public Publication updatePub(Publication p) ;

	public Publication findPubById(Long id) ;
	public List<Publication> findAllPub();
	// Other
	public void addAuthor(Membre m, Publication p);
	public List<Publication> findPubByDate(Date d);
	public List<Publication> findPubByType(String type);

}
