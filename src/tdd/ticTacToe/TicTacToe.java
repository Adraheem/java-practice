package tdd.ticTacToe;

import java.util.Arrays;

public class TicTacToe {
    private final Player player1;
    private final Player player2;
    private final Player[] playPositions;
    private Player winner;
    private int counter;
    private final int[][] winArrays = {{0,1,2}, {3,4,5}, {6,7,8}, {0,3,6}, {1,4,7}, {2,5,8}, {0,4,8},{2,4,6}};

    public TicTacToe(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
        playPositions = new Player[9];
        Player emptyPlayer = new Player("Empty", PlayerCharacter.E);
        Arrays.fill(playPositions, emptyPlayer);
    }

    public String getGameDisplay(){
        return String.format("""
                ===================
                |  %s  |  %s  |  %s  |
                |  %s  |  %s  |  %s  |
                |  %s  |  %s  |  %s  |
                ===================
                """,
                getPlayerCharacter(0), getPlayerCharacter(1), getPlayerCharacter(2),
                getPlayerCharacter(3), getPlayerCharacter(4), getPlayerCharacter(5),
                getPlayerCharacter(6), getPlayerCharacter(7), getPlayerCharacter(8));
    }

    private String getPlayerCharacter(int index){
        if (playPositions[index].getPlayerCharacter() == PlayerCharacter.E){
            return " ";
        } else {
            return playPositions[index].getPlayerCharacter().toString();
        }
    }

    public void setPlayPosition(int position, Player player){
        if (position < 1 || position > 9){
            throw new PlayPositionException("Invalid play position");
        }
        else if (!(playPositions[position - 1].getPlayerCharacter() == PlayerCharacter.E)){
            throw new PlayPositionException();
        } else{
            playPositions[position - 1] = player;
            counter++;
            checkForWinner();
        }
    }

    public boolean canPlay(){
        return !isGameWon() && counter < 9;
    }

    public boolean cannotPlayPosition(int position){
        return !(playPositions[position - 1].getPlayerCharacter() == PlayerCharacter.E);
    }

    public boolean isGameWon(){
        return winner != null;
    }

    private void checkForWinner(){
        for(int[] winArray : winArrays){
            if (
                    cannotPlayPosition(winArray[0] + 1)
                            && playPositions[winArray[0]].equals(playPositions[winArray[1]])
                            && playPositions[winArray[1]].equals(playPositions[winArray[2]])
            ){
                winner = playPositions[winArray[0]];
                break;
            }
        }
    }

    public Player getWinner(){
        return winner;
    }

    public String printResult(){
        if (canPlay()){
            return "Keep playing...";
        }
        if (isGameWon()){
            return String.format("%s WON... Congratulations  \uD83C\uDF89 ", winner.getName());
        }

        return " ❌  ❌  ❌ GAME OVER!  ❌  ❌  ❌ ";
    }
}
