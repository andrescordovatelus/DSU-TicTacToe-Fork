package com.dsu.tictactoe;

import com.dsu.tictactoe.controller.TictacToeController;
import com.dsu.tictactoe.model.Tictactoe;
import com.dsu.tictactoe.utils.ConsoleFactory;
import com.dsu.tictactoe.view.Menu;

public class TictactoeApp {
    private Tictactoe tictactoe;
    private TictacToeController tictacToeController;
    private ConsoleFactory consoleFactory;

    private Menu menu;

    public TictactoeApp() {
        tictactoe = new Tictactoe();
        menu = new Menu();
        consoleFactory = new ConsoleFactory();
    }

    public void runGame() {
        int response = menu.menuConsole();
        consoleFactory.getConsole(response);
        tictacToeController = new TictacToeController(tictactoe);
        tictacToeController.mainMenu();
    }
}
