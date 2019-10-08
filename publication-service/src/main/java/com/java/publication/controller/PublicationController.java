package com.java.publication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.java.publication.domain.Publication;
import com.java.publication.service.PublicationService;

@RestController
@RequestMapping("/api/publication")
public class PublicationController {

	@Autowired
	PublicationService publicationService;

	@PostMapping("/add")
	public ResponseEntity<?> addPublication(@RequestBody Publication publication) {
		Publication publiSaved = publicationService.addPublication(publication);
		return new ResponseEntity<Publication>(publiSaved, HttpStatus.CREATED);
	}
}
