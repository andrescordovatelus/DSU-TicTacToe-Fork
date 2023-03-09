package com.dsu.tictactoe.view.interfaces;

import com.dsu.tictactoe.view.BoardView;
import com.dsu.tictactoe.view.TicTacToeView;
import com.dsu.tictactoe.view.TurnView;
import com.dsu.tictactoe.view.player.PlayerManagerView;

public interface ViewFactoryInterface {
    BoardView getBoardView();
    TicTacToeView getTicTacToeView();
    TurnView getTurnView();
    PlayerManagerView getPlayerManagerView();
}
