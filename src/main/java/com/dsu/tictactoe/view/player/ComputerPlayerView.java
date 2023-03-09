package com.dsu.tictactoe.view.player;

import com.dsu.tictactoe.model.board.Coordinate;
import com.dsu.tictactoe.model.board.PutMarkError;
import com.dsu.tictactoe.utils.ConsoleFactory;
import com.dsu.tictactoe.utils.ConsoleInterface;

public class ComputerPlayerView extends PlayerView {

    private ConsoleInterface console;

    public ComputerPlayerView() {
        this.console = ConsoleFactory.console;
    }

    @Override
    public String getName( String message) {
        console.readString("Thinking the name, press enter please . . . ");
        String name = ComputerPlayerView.getAlphaNumericString(10);
        console.readString("The name is "+name+" and means nothin xD. Enter to continue. . .");
        return name ;
    }

    @Override
    public Coordinate getCoordinate(PutMarkError putMarkError) {
        if (putMarkError!= PutMarkError.NOT_ERROR){
            console.printLine("Oh no!, an error :P");
        }
        return null;
    }

    public void turnFinish(){
        console.readString("Enter to continue . . . ");
    }

    public void showThinkingAboutTheCoordinate(int x, int y ){
        console.printLine("My possible coordinate is: x"+x+" y: "+y);
    }


    /**
     * source: https://www.geeksforgeeks.org/generate-random-string-of-given-size-in-java/
     * @param n
     * @return
     */
    static String getAlphaNumericString(int n) {

        // choose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index = (int) (AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

}
