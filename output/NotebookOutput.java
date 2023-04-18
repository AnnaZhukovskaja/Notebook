package lec16.output;

import lec16.entity.Note;

import java.util.List;

public class NotebookOutput {
    public void print(String title, List<Note> notes) {

        System.out.println("_____________________________________");
        System.out.println(title.toUpperCase());
        System.out.println("_____________________________________");
        System.out.println();

        if(notes == null || notes.size() <= 0) {
            System.out.println("Нет записей для вывода.");
            return;
        }

        for(Note n : notes) {
            System.out.println(n.getId() + " - " + n.getTitle());
        }

    }
}
