package archery;

import java.util.ArrayList;
import java.util.List;

public class ArcheryGame {

    private final List<Player> players = new ArrayList<>();

    public void addPlayer(Player player) {
        players.add(player);
    }

    public List<Player> getPlayers() {
        return players;
    }
}
