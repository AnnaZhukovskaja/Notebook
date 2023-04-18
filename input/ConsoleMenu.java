package lec16.input;

import lec16.entity.Note;
import lec16.logic.NotebookLogic;

import java.util.List;
import java.util.Scanner;

public class ConsoleMenu {

    boolean exit = false;

    public ConsoleMenu() {
    }

    NotebookLogic logic = new NotebookLogic();

    public void inputInfo() {

        System.out.println("Добро пожаловать в электронный блокнот!");
        System.out.println("Если хотите внести новую запись нажмите - 1, если хотите найти запись нажмите  - 2, если хотите просмотреть все записи нажмите - 3, если хотите выйти нажмите - 4");
        System.out.println("Пожалуйста, сделайте свой выбор: ");

        while (!exit) {

            Scanner console = new Scanner(System.in);

            if (console.hasNextInt()) {
                int inputNumber = console.nextInt();

                if (inputNumber == 1) {

                    Scanner sc = new Scanner(System.in);
                    System.out.println("Заполните , пожалуйста, название: ");
                    String inputTitle = sc.nextLine();

                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Заполните , пожалуйста, содержание записи: ");
                    String inputContent = sc1.nextLine();

                    Note addInputNote = new Note(inputTitle, inputContent);

                    logic.add(addInputNote);
                    System.out.println("Запись добавлена.");
                    System.out.println("Если хотите внести новую запись нажмите - 1, если хотите найти запись нажмите  - 2, если хотите просмотреть все записи нажмите - 3, если хотите выйти нажмите - 4");
                    System.out.println("Пожалуйста, еще раз сделайте свой выбор: ");

                } else if (inputNumber == 2) {

                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Введите название или содержание записи, которое хотите найти: ");

                    String textInputNote = sc2.nextLine();

                    List<Note> rezult = logic.find(textInputNote);
                    System.out.println(rezult);
                    System.out.println("Если хотите внести новую запись нажмите - 1, если хотите найти запись нажмите  - 2, если хотите просмотреть все записи нажмите - 3, если хотите выйти нажмите - 4");
                    System.out.println("Пожалуйста, еще раз сделайте свой выбор: ");

                } else if (inputNumber == 3) {
                    System.out.println(logic.allNotes());
                    System.out.println("Если хотите внести новую запись нажмите - 1, если хотите найти запись нажмите  - 2, если хотите просмотреть все записи нажмите - 3, если хотите выйти нажмите - 4");
                    System.out.println("Пожалуйста, еще раз сделайте свой выбор: ");

                } else if (inputNumber == 4) {
                    System.out.println("Всего доброго!");
                    break;

                }
            } else {
                System.out.println("Вы ввели не число.");
                System.out.println("Если хотите внести новую запись нажмите - 1, если хотите найти запись нажмите  - 2, если хотите просмотреть все записи нажмите - 3, если хотите выйти нажмите - 4");
                System.out.println("Пожалуйста, еще раз сделайте свой выбор: ");
            }
        }
    }
}
