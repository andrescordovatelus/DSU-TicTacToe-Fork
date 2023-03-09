package com.dsu.tictactoe.view;

import java.util.Scanner;

public class Menu {

    public int menuConsole() {
        Scanner sc = new Scanner(System.in);
        int optionSelected = 0;
        System.out.println("-------------------------------------------------");
        System.out.println("> Please select a type of console to use: ");
        System.out.println("-------------------------------------------------");
        System.out.println("> 1. Console1, reference style => (###)");
        System.out.println("> 2. Console2, reference style => (---)");
        System.out.println("-------------------------------------------------");
        System.out.print("\t> Your option: ");
        optionSelected = sc.nextInt();
        return optionSelected;
    }
}
