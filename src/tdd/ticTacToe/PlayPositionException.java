package tdd.ticTacToe;

public class PlayPositionException extends RuntimeException {
    public PlayPositionException(String message){
        super(message);
    }

    public PlayPositionException(){
        super("Position already played");
    }
}
