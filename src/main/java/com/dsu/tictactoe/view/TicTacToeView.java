package com.dsu.tictactoe.view;

import com.dsu.tictactoe.model.Result;
import com.dsu.tictactoe.utils.ConsoleFactory;
import com.dsu.tictactoe.utils.ConsoleInterface;
import com.dsu.tictactoe.view.interfaces.TicTacTocViewInterface;

public class TicTacToeView implements TicTacTocViewInterface {

    private ConsoleInterface console;

    public TicTacToeView() {
        this.console = ConsoleFactory.console;
    }

    public void showInstruccions() {
        console.printTitle("TicTacToe");
        String whatIs = "Tic Tac Toe is a puzzle game for two players, called X and O, who take turns marking the spaces in a 3×3 grid. The player who succeeded in placing three respective marks in a horizontal, vertical, or diagonal row wins the game. There is also option to play with single player and device will play with you. Also multiplayer means Human vs Human. You can play free puzzle games with your friends and relatives. TicTacToe is playable both on your desktop and on your mobile phone!";
        console.printLine(whatIs);

        console.printTitle("How to play Tic Tac Toe?");
        String instructions = "Create your players, and use coordenates to put your pieces.";
        console.printLine(instructions);
    }

    public void showStatistics(Result result) {
        console.printTitle("Statistics");
        if (result.isATie()){
            console.printTitle("TIE");
            console.printLine(result.getPlayers()[0].toString());
            console.printLine(result.getPlayers()[1].toString());
            return;
        }

        console.printTitle("Winner: "+result.getWinner().toString());
        console.printLine("Loser: "+result.getLoser());
        console.readString("Enter to continue");
    }

    public int mainMenu() {
        int optionSelected = 0;
        do {
            console.printTitle("Main menu");
            console.printLine("1) List players.");
            console.printLine("2) Create player.");
            console.printLine("3) Init game.");
            console.printLine("0) Exit.");
            console.printWhiteLine();
            optionSelected = console.readInt("Enter your option:");
            if (!(optionSelected>=0 && optionSelected<4)){
                console.printLine("Error: wrong selection");
            }
            else{
                return optionSelected;
            }
        } while (true);
    }
}
