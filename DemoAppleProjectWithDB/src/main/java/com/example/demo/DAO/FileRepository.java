package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.DocumentEntity;

@Repository
public interface FileRepository extends JpaRepository<DocumentEntity, Integer> {
	
	
	
	
	
	  /*
      void save(DocumentEntity doc);
      
      void delete(DocumentEntity doc);*/
      
}
