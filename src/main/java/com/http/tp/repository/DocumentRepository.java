package com.http.tp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.http.tp.classes.Document;

public interface DocumentRepository extends JpaRepository<Document, Integer> {
	List<Document> findByIdUser(int iduser);

}
