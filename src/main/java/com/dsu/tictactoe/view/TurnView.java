package com.dsu.tictactoe.view;

import com.dsu.tictactoe.model.board.Mark;
import com.dsu.tictactoe.model.board.PutMarkError;
import com.dsu.tictactoe.utils.ConsoleFactory;
import com.dsu.tictactoe.utils.ConsoleInterface;
import com.dsu.tictactoe.view.interfaces.TurnViewInterface;

public class TurnView implements TurnViewInterface {

    private ConsoleInterface console;

    public TurnView() {
        this.console = ConsoleFactory.console;
    }

    public void playerTurn(Mark turnMark, PutMarkError putMarkError, String playerName) {
        console.printWhiteLine();
        console.printTitle("Player Turn: " + turnMark.toString() + " - " + playerName);
        if (putMarkError != PutMarkError.NOT_ERROR) {
            console.printLine("Input error: " + putMarkError.getErrorDescription());
        }
    }
}
