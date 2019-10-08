package com.java.publication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.publication.domain.Publication;
import com.java.publication.respository.PublicationRepository;

@Service
public class PublicationServiceImpl implements PublicationService {
	
	@Autowired
	PublicationRepository publicationRepository;
	
	@Override
	public Publication addPublication(Publication publication) {
		Publication publicationSaved = publicationRepository.save(publication);
		return publicationSaved;
	}
}
