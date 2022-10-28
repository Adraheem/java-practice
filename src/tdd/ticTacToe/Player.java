package tdd.ticTacToe;

import java.security.SecureRandom;

public class Player {
    private final int id;
    private final String name;
    private final String playerCharacter;

    public Player(String name, String playerCharacter){
        SecureRandom secureRandom = new SecureRandom();

        this.id = secureRandom.nextInt(999999);
        this.name = name;
        this.playerCharacter = playerCharacter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPlayerCharacter() {
        return playerCharacter;
    }
}
