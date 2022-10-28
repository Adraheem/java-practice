package tdd.ticTacToe;

import java.util.Arrays;

public class TicTacToe {
    private final Player player1;
    private final Player player2;
    private final String[] playPositions;
    private Player winner;
    private int counter;
    private final int[][] winArrays = {{0,1,2}, {3,4,5}, {6,7,8}, {0,3,6}, {1,4,7}, {2,5,8}, {0,4,8},{2,4,6}};

    public TicTacToe(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
        playPositions = new String[9];
        Arrays.fill(playPositions, " ");
    }

    public String getGameDisplay(){
        return String.format("""
                ===================
                |  %s  |  %s  |  %s  |
                |  %s  |  %s  |  %s  |
                |  %s  |  %s  |  %s  |
                ===================
                """,
                playPositions[0], playPositions[1], playPositions[2],
                playPositions[3], playPositions[4], playPositions[5],
                playPositions[6], playPositions[7], playPositions[8]);
    }

    public void setPlayPosition(int position, Player player){
        if(position > 0 && position < 10){
            playPositions[position - 1] = player.getPlayerCharacter();
            counter++;
        }
    }

    private Player getPlayerFromPlay(String play){
        if (play.equalsIgnoreCase(player1.getPlayerCharacter())){
            return player1;
        }
        else if (play.equalsIgnoreCase(player2.getPlayerCharacter())){
            return player2;
        }
        else {
            return null;
        }
    }

    public boolean canPlay(){
        return !isGameWon() && counter < 9;
    }

    public boolean cannotPlayPosition(int position){
        if (position < 1 || position > 9){
            return true;
        }
        return !playPositions[position - 1].equalsIgnoreCase(" ");
    }

    private boolean isGameWon(){
        boolean response = false;
        for(int[] winArray : winArrays){
            if (
                    cannotPlayPosition(winArray[0] + 1)
                    && playPositions[winArray[0]].equalsIgnoreCase(playPositions[winArray[1]])
                    && playPositions[winArray[1]].equalsIgnoreCase(playPositions[winArray[2]])
            ){
                winner = getPlayerFromPlay(playPositions[winArray[0]]);
                response = true;
                break;
            }
        }
        return response;
    }

    public Player getWinner(){
        return winner;
    }

    public String printResult(){
        if (isGameWon()){
            return String.format("%s WON... Congratulations  \uD83C\uDF89 ", winner.getName());
        }

        return " ❌  ❌  ❌ GAME OVER!  ❌  ❌  ❌ ";
    }
}
