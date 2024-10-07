package com.spring.security.demo.services;

import com.spring.security.demo.models.Note;

import java.util.List;

public interface NoteService {
    Note createNote(String content, String owner);
    Note updateNote(Long id, String content, String owner);
    void deleteNote(Long id);
    List<Note> getNotesByOwner(String owner);
}
