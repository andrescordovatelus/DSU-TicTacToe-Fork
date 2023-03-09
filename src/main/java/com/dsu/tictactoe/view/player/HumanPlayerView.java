package com.dsu.tictactoe.view.player;

import com.dsu.tictactoe.model.board.Coordinate;
import com.dsu.tictactoe.model.board.PutMarkError;
import com.dsu.tictactoe.utils.ConsoleFactory;
import com.dsu.tictactoe.utils.ConsoleInterface;

public class HumanPlayerView extends PlayerView {

    private ConsoleInterface console;

    public HumanPlayerView() {
        this.console = ConsoleFactory.console;
    }

    @Override
    public String getName(String message) {
        return console.readString(message);
    }

    @Override
    public Coordinate getCoordinate(PutMarkError putMarkError) {
        return new Coordinate(console.readInt("Input coordinate x:"), console.readInt("Input coordinate y:"));
    }

}