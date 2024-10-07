package com.spring.security.demo.services.impl;

import com.spring.security.demo.models.Note;
import com.spring.security.demo.repositories.NoteRepository;
import com.spring.security.demo.services.NoteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {

    private final NoteRepository noteRepository;

    public NoteServiceImpl(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Override
    public Note createNote(String content, String owner) {
        Note note = new Note();
        note.setContent(content);
        note.setOwner(owner);
        return noteRepository.save(note);
    }

    @Override
    public Note updateNote(Long id, String content, String owner) {
        Note currentNote = this.noteRepository.findById(id).orElseThrow(()-> new RuntimeException("Note not found"));
        currentNote.setContent(content);
        currentNote.setOwner(owner);
        return noteRepository.save(currentNote);
    }

    @Override
    public void deleteNote(Long id) {
        this.noteRepository.deleteById(id);
    }

    @Override
    public List<Note> getNotesByOwner(String owner) {
        return this.noteRepository.findByOwner(owner);
    }

}
