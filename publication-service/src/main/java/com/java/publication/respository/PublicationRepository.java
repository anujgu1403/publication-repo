package com.java.publication.respository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.java.publication.domain.Publication;

@Repository
public interface PublicationRepository extends CrudRepository<Publication, Integer>{
	
	@Query("from publication p where inner join on author_publication ap where ap.author_id in (select a.id from author a where name= :name) and p.year= :year ")
	List<Publication> findPublicationByYearAndAuthor(@Param("name") String name, @Param("year") String year);

}
