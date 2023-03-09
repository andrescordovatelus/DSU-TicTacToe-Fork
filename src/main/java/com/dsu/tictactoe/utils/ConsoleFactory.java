package com.dsu.tictactoe.utils;

public class ConsoleFactory {

    public static ConsoleInterface console;

    public void getConsole(int consoleType) {
        if (consoleType == 1) {
            console = new Console();
        } else if (consoleType == 2) {
            console = new Console2();
        } else {
            console = new Console();
        }
    }
}
