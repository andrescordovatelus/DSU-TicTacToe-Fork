package com.dsu.tictactoe.utils;

import com.dsu.tictactoe.view.ViewFactory;
import com.dsu.tictactoe.view.interfaces.ViewFactoryInterface;

public class SingletonViews {
    private static ViewFactoryInterface instance = null;

    private SingletonViews() {

    }

    public static ViewFactoryInterface getInstance() {
        if (instance == null) {
            instance = new ViewFactory();
        }
        return instance;
    }
}
