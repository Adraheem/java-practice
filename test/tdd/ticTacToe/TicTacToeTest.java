package tdd.ticTacToe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    private TicTacToe ticTacToe;
    private Player player1;
    private Player player2;

    @BeforeEach
    void setup(){
        player1 = new Player("John Doe", "X");
        player2 = new Player("Jane", "O");

        ticTacToe = new TicTacToe(player1, player2);
    }

    @Test
    void canDisplayGameAtBeginningTest(){
        String display = ticTacToe.getGameDisplay();
        String expected = """
                ===================
                |     |     |     |
                |     |     |     |
                |     |     |     |
                ===================
                """;
        assertEquals(expected, display);
    }

    @Test
    void playerCanPlayPosition1(){
        ticTacToe.setPlayPosition(1, player1);
        String display = ticTacToe.getGameDisplay();
        String expected = """
                ===================
                |  X  |     |     |
                |     |     |     |
                |     |     |     |
                ===================
                """;
        assertEquals(expected, display);
    }

    @Test
    void player2CanPlayPosition1(){
        ticTacToe.setPlayPosition(1, player2);
        String display = ticTacToe.getGameDisplay();
        String expected = """
                ===================
                |  O  |     |     |
                |     |     |     |
                |     |     |     |
                ===================
                """;
        assertEquals(expected, display);
    }

    @Test
    void players1and2CanPlayPosition1and2(){
        ticTacToe.setPlayPosition(1, player1);
        ticTacToe.setPlayPosition(2, player2);
        String display = ticTacToe.getGameDisplay();
        String expected = """
                ===================
                |  X  |  O  |     |
                |     |     |     |
                |     |     |     |
                ===================
                """;
        assertEquals(expected, display);
    }

    @Test
    void cannotPlayPositionAfterPlayedTest(){
        ticTacToe.setPlayPosition(1, player1);

        PlayPositionException exception = assertThrows(PlayPositionException.class, () -> ticTacToe.setPlayPosition(1,
                player2));
        assertTrue(exception.getMessage().contains("Position already played"));
    }

    @Test
    void wrongPlayPositionAboveBoundTest(){
        PlayPositionException exception = assertThrows(PlayPositionException.class, () -> ticTacToe.setPlayPosition(10,
                player2));
        assertTrue(exception.getMessage().contains("Invalid play position"));
    }

    @Test
    void wrongPlayPositionBelowBoundTest(){
        PlayPositionException exception = assertThrows(PlayPositionException.class, () -> ticTacToe.setPlayPosition(0,
                player2));
        assertTrue(exception.getMessage().contains("Invalid play position"));
    }

    @Test
    void gameCanBeWonByPlayer1Test(){
        ticTacToe.setPlayPosition(1, player1);
        ticTacToe.setPlayPosition(2, player1);
        ticTacToe.setPlayPosition(3, player1);

        String display = ticTacToe.getGameDisplay();
        String expected = """
                ===================
                |  X  |  X  |  X  |
                |     |     |     |
                |     |     |     |
                ===================
                """;

        assertEquals(expected, display);
        assertTrue(ticTacToe.isGameWon());
    }

    @Test
    void gameCanBeWonByPlayer2Test(){
        ticTacToe.setPlayPosition(1, player2);
        ticTacToe.setPlayPosition(2, player2);
        ticTacToe.setPlayPosition(3, player2);

        String display = ticTacToe.getGameDisplay();
        String expected = """
                ===================
                |  O  |  O  |  O  |
                |     |     |     |
                |     |     |     |
                ===================
                """;

        assertEquals(expected, display);
        assertTrue(ticTacToe.isGameWon());
    }

    @Test
    void player1CanWinOneTwoThreePositionsTest(){
        ticTacToe.setPlayPosition(1, player1);
        ticTacToe.setPlayPosition(2, player1);
        ticTacToe.setPlayPosition(3, player1);

        String display = ticTacToe.getGameDisplay();
        String expected = """
                ===================
                |  X  |  X  |  X  |
                |     |     |     |
                |     |     |     |
                ===================
                """;

        assertEquals(expected, display);
        assertSame(player1, ticTacToe.getWinner());
    }

    @Test
    void player1CanWinFourFiveSixPositionsTest(){
        ticTacToe.setPlayPosition(4, player1);
        ticTacToe.setPlayPosition(5, player1);
        ticTacToe.setPlayPosition(6, player1);

        String display = ticTacToe.getGameDisplay();
        String expected = """
                ===================
                |     |     |     |
                |  X  |  X  |  X  |
                |     |     |     |
                ===================
                """;

        assertEquals(expected, display);
        assertSame(player1, ticTacToe.getWinner());
    }

    @Test
    void player1CanWinSevenEightNinePositionsTest(){
        ticTacToe.setPlayPosition(7, player1);
        ticTacToe.setPlayPosition(8, player1);
        ticTacToe.setPlayPosition(9, player1);

        String display = ticTacToe.getGameDisplay();
        String expected = """
                ===================
                |     |     |     |
                |     |     |     |
                |  X  |  X  |  X  |
                ===================
                """;

        assertEquals(expected, display);
        assertSame(player1, ticTacToe.getWinner());
    }

    @Test
    void player1CanWinOneFourSevenPositionsTest(){
        ticTacToe.setPlayPosition(1, player1);
        ticTacToe.setPlayPosition(4, player1);
        ticTacToe.setPlayPosition(7, player1);

        String display = ticTacToe.getGameDisplay();
        String expected = """
                ===================
                |  X  |     |     |
                |  X  |     |     |
                |  X  |     |     |
                ===================
                """;

        assertEquals(expected, display);
        assertSame(player1, ticTacToe.getWinner());
    }

    @Test
    void player1CanWinTwoFiveEightPositionsTest(){
        ticTacToe.setPlayPosition(2, player1);
        ticTacToe.setPlayPosition(5, player1);
        ticTacToe.setPlayPosition(8, player1);

        String display = ticTacToe.getGameDisplay();
        String expected = """
                ===================
                |     |  X  |     |
                |     |  X  |     |
                |     |  X  |     |
                ===================
                """;

        assertEquals(expected, display);
        assertSame(player1, ticTacToe.getWinner());
    }

    @Test
    void player1CanWinThreeSixNinePositionsTest(){
        ticTacToe.setPlayPosition(3, player1);
        ticTacToe.setPlayPosition(6, player1);
        ticTacToe.setPlayPosition(9, player1);

        String display = ticTacToe.getGameDisplay();
        String expected = """
                ===================
                |     |     |  X  |
                |     |     |  X  |
                |     |     |  X  |
                ===================
                """;

        assertEquals(expected, display);
        assertSame(player1, ticTacToe.getWinner());
    }

    @Test
    void player1CanWinOneFiveNinePositionsTest(){
        ticTacToe.setPlayPosition(1, player1);
        ticTacToe.setPlayPosition(5, player1);
        ticTacToe.setPlayPosition(9, player1);

        String display = ticTacToe.getGameDisplay();
        String expected = """
                ===================
                |  X  |     |     |
                |     |  X  |     |
                |     |     |  X  |
                ===================
                """;

        assertEquals(expected, display);
        assertSame(player1, ticTacToe.getWinner());
    }

    @Test
    void player1CanWinThreeFiveSevenPositionsTest(){
        ticTacToe.setPlayPosition(3, player1);
        ticTacToe.setPlayPosition(5, player1);
        ticTacToe.setPlayPosition(7, player1);

        String display = ticTacToe.getGameDisplay();
        String expected = """
                ===================
                |     |     |  X  |
                |     |  X  |     |
                |  X  |     |     |
                ===================
                """;

        assertEquals(expected, display);
        assertSame(player1, ticTacToe.getWinner());
    }

    @Test
    void player1WinsTest(){
        ticTacToe.setPlayPosition(1, player1);
        ticTacToe.setPlayPosition(2, player2);
        ticTacToe.setPlayPosition(5, player1);
        ticTacToe.setPlayPosition(7, player2);
        ticTacToe.setPlayPosition(9, player1);

        String display = ticTacToe.getGameDisplay();
        String expected = """
                ===================
                |  X  |  O  |     |
                |     |  X  |     |
                |  O  |     |  X  |
                ===================
                """;

        assertEquals(expected, display);
        assertSame(player1, ticTacToe.getWinner());
    }

    @Test
    void canPlayWhenNoWinnerAndPlayPositionsRemainTest(){
        ticTacToe.setPlayPosition(1, player1);
        ticTacToe.setPlayPosition(2, player2);
        ticTacToe.setPlayPosition(6, player1);
        ticTacToe.setPlayPosition(7, player2);
        ticTacToe.setPlayPosition(9, player1);

        String display = ticTacToe.getGameDisplay();
        String expected = """
                ===================
                |  X  |  O  |     |
                |     |     |  X  |
                |  O  |     |  X  |
                ===================
                """;

        assertEquals(expected, display);
        assertTrue(ticTacToe.canPlay());
    }

    @Test
    void cannotPlayWhenWinnerTest(){
        ticTacToe.setPlayPosition(1, player1);
        ticTacToe.setPlayPosition(2, player2);
        ticTacToe.setPlayPosition(5, player1);
        ticTacToe.setPlayPosition(7, player2);
        ticTacToe.setPlayPosition(9, player1);

        String display = ticTacToe.getGameDisplay();
        String expected = """
                ===================
                |  X  |  O  |     |
                |     |  X  |     |
                |  O  |     |  X  |
                ===================
                """;

        assertEquals(expected, display);
        assertSame(player1, ticTacToe.getWinner());
        assertFalse(ticTacToe.canPlay());
    }

    @Test
    void cannotPlayWhenNoWinnerAndPlayPositionsExhaustedTest(){
        ticTacToe.setPlayPosition(1, player1);
        ticTacToe.setPlayPosition(2, player2);
        ticTacToe.setPlayPosition(4, player1);
        ticTacToe.setPlayPosition(3, player2);
        ticTacToe.setPlayPosition(6, player1);
        ticTacToe.setPlayPosition(5, player2);
        ticTacToe.setPlayPosition(8, player1);
        ticTacToe.setPlayPosition(7, player2);
        ticTacToe.setPlayPosition(9, player1);

        String display = ticTacToe.getGameDisplay();
        String expected = """
                ===================
                |  X  |  O  |  O  |
                |  X  |  O  |  X  |
                |  O  |  X  |  X  |
                ===================
                """;

        assertEquals(expected, display);
        assertFalse(ticTacToe.canPlay());
    }
}