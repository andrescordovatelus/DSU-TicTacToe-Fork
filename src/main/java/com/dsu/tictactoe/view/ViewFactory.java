package com.dsu.tictactoe.view;

import com.dsu.tictactoe.view.interfaces.ViewFactoryInterface;
import com.dsu.tictactoe.view.player.PlayerManagerView;

public class ViewFactory implements ViewFactoryInterface{

    @Override
    public BoardView getBoardView() {
        return new BoardView();
    }

    @Override
    public TicTacToeView getTicTacToeView() {
        return new TicTacToeView();
    }

    @Override
    public TurnView getTurnView() {
        return new TurnView();
    }

    @Override
    public PlayerManagerView getPlayerManagerView() {
        return new PlayerManagerView();
    }
}
