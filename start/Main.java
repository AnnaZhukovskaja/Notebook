package lec16.start;

import lec16.entity.Note;
import lec16.input.ConsoleMenu;
import lec16.logic.NotebookLogic;
import lec16.output.NotebookOutput;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        ConsoleMenu menu = new ConsoleMenu();
        menu.inputInfo();

       NotebookLogic logic = new NotebookLogic();

//        logic.add("title1", "content1");
//        logic.add("title2", "content2");
//        logic.add("title3", "content3");
//
        List<Note> myNotes = logic.allNotes();

        NotebookOutput output = new NotebookOutput();

        output.print("all notes", myNotes);


    }
}
