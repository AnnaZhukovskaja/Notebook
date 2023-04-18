package lec16.dao;

import lec16.entity.Note;
import lec16.entity.Notebook;
import lec16.source.NoteBookProvider;

import java.util.List;


public class NoteBookDao {
    /*
     * public void create() { NoteBookProvider.getInstance(); }
     */

    private final NoteBookProvider provider = NoteBookProvider.getInstance();
    private final Notebook nb = provider.getNotebook();

    public void save(Note n) {
        nb.setNotes(n);
    }

    public List<Note> allNotes() {
        return nb.getNotes();
    }
}
