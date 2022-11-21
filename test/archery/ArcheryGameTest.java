package archery;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArcheryGameTest {
    private ArcheryGame game;

    @BeforeEach
    void setUp(){
        game = new ArcheryGame();
    }

    @Test
    void testThatArcheryGameExists(){
        assertNotNull(game);
    }

    @Test
    void testThatPlayersCanExistInGame() {
        Player player1 = new Player();
        game.addPlayer(player1);

        assertEquals(1, game.getPlayers().size());
    }
}
