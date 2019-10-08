package com.java.publication.respository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.java.publication.domain.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer>{

}
