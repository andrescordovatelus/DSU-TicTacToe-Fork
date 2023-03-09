package com.dsu.tictactoe.view.player;

import com.dsu.tictactoe.model.board.Coordinate;
import com.dsu.tictactoe.model.board.PutMarkError;
import com.dsu.tictactoe.model.player.Player;
import com.dsu.tictactoe.utils.ConsoleFactory;
import com.dsu.tictactoe.utils.ConsoleInterface;
import com.dsu.tictactoe.view.interfaces.playerInterfaces.PlayerViewInterface;

public abstract class PlayerView implements PlayerViewInterface {

    private ConsoleInterface console;

    public PlayerView() {
        this.console = ConsoleFactory.console;
    }

    /**
     * For this reason we create the PutMarkError
     * To avoid code of this type
     */
    public Player getPlayer(String errorMessage, String numberPlayer) {
        if (errorMessage!=null){
            console.printLine(errorMessage);
        }
        String name = "";
        do {
            name = getName( "Name of "+numberPlayer+" the player:");
            //Console.readString("Name of "+numberPlayer+" the player:")
            name = name.trim();
            if (name.length()==0){
                errorMessage = "Invalid username, enter again.";;
            }
        } while (name.length()==0);
        return new Player(name);
    }

    public abstract String getName(String message);

    public abstract Coordinate getCoordinate( PutMarkError putMarkError);



}
