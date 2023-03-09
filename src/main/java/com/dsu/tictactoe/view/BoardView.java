package com.dsu.tictactoe.view;

import com.dsu.tictactoe.model.board.Mark;
import com.dsu.tictactoe.utils.ConsoleFactory;
import com.dsu.tictactoe.utils.ConsoleInterface;
import com.dsu.tictactoe.view.interfaces.BoardViewInterface;

public class BoardView implements BoardViewInterface{

    private ConsoleInterface console;

    public BoardView() {
        this.console = ConsoleFactory.console;
    }

    public void showBoard(Mark[][] matrixMarks) {
        String firstSpace = "    ";
        String header =  "y/x "+"0|1|2";
        String rowDiv = firstSpace+"-----";
        String[] rows = new String[matrixMarks.length];
        for (int i = 0; i < matrixMarks.length; i++) {
            rows[i]=i+firstSpace.substring(0,firstSpace.length()-1);
            for (int j = 0; j < matrixMarks.length; j++) {
                rows[i]+=matrixMarks[j][i].toString();
                if (j < (matrixMarks.length-1)){
                    rows[i]+="|";
                }
            }
        }
        console.printWhiteLine();
        console.printLine(header);
        for (int i = 0; i < rows.length; i++) {
            console.printLine(rows[i]);
            if (i<(rows.length-1)){
                console.printLine(rowDiv);
            }
        }
        console.printWhiteLine();
    }
}
