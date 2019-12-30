package com.example.demo.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.*;
@org.springframework.stereotype.Repository
public interface PublicationRepository extends JpaRepository<Publication, Long> {
	List<Publication> findByType(String type);

	List<Publication> findByDateApparitionBetween(Date d1, Date d2);

	public List<Publication> findPubByDateApparition(Date d);

	public List<Publication> findPubByType(String type);

}
