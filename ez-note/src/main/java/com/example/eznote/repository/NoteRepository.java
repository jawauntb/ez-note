package com.example.eznote.repository;

import com.example.eznote.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}