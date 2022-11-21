package practice.ticTacToe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {
    private TicTacToe ticTacToe;
    private Player player1;
    private Player player2;

    @BeforeEach
    void setUp(){
        player1 = new Player();
        player2 = new Player();
        ticTacToe = new TicTacToe(player1, player2);
    }

    @Test
    void ticTacToeExistsTest(){
        assertNotNull(ticTacToe);
    }

    @Test
    void playersExistTest(){
        assertNotNull(ticTacToe.getPlayer1());
        assertNotNull(ticTacToe.getPlayer2());
    }

    @Test
    void ticTacToeHasBoardTest(){
        String expected = """
                |     |     |     |
                |     |     |     |
                |     |     |     |
                """;
        assertEquals(expected, ticTacToe.getBoard());
    }
}
