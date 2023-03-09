package com.dsu.tictactoe.utils;

import java.util.Scanner;

public class Console2 implements ConsoleInterface {
    private static Scanner scanner = new Scanner(System.in);
    private final static String FIRST_LINE = "\n";

    @Override
    public void printTitle(String message) {
        System.out.println(FIRST_LINE);
        printLine("--------------------------------------------------------");
        printLine(message.toUpperCase());
        printLine("--------------------------------------------------------");
    }

    @Override
    public void printWhiteLine() {
        System.out.println(FIRST_LINE);
    }

    @Override
    public void printLine(String text) {
        System.out.println(text);
    }

    @Override
    public String readString(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    @Override
    public int readInt(String message) {
        int result = 0;
        boolean validResult = false;
        while (!validResult) {
            try {
                result = Integer.parseInt(readString(message));
                validResult = true;
            } catch (Exception e) {
                printLine(" --- Number invalid ---");
                validResult = false;
            }
        }
        return result;
    }

    @Override
    public void printMultipleLines(String text, int maxLenght) {
        do {
            if (text.length() > maxLenght) {
                printLine(text.substring(0, maxLenght));
                text = text.substring(maxLenght + 1);
            } else {
                printLine(text);
            }

        } while (text.length() > maxLenght);
    }
}
