package tdd.ticTacToe;

import java.security.SecureRandom;

public class Player {
    private final int id;
    private final String name;
    private final PlayerCharacter playerCharacter;

    public Player(String name, PlayerCharacter playerCharacter){
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

    public PlayerCharacter getPlayerCharacter() {
        return playerCharacter;
    }
}
