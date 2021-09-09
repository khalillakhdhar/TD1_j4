package com.http.tp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.http.tp.classes.Messages;
public interface MessageRepository extends JpaRepository<Messages, Integer> {
	List<Messages> findByEmetteur(int emetteur);
}
