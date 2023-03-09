package com.dsu.tictactoe.utils;

public interface ConsoleInterface {
    public void printTitle(String message);

    public void printWhiteLine();

    public void printLine(String text);

    public String readString(String message);

    public int readInt(String message);

    public void printMultipleLines(String text, int maxLenght);
}
