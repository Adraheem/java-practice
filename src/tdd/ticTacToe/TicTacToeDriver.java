package tdd.ticTacToe;

import java.security.SecureRandom;
import java.util.Scanner;

public class TicTacToeDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom secureRandom = new SecureRandom();

        System.out.print("Player 1, enter your name: ");
        String p1Name = input.nextLine();
        Player player1 = new Player(p1Name, PlayerCharacter.X);

        System.out.print("Player 2, enter your name: ");
        String p2Name = input.nextLine();
        Player player2 = new Player(p2Name, PlayerCharacter.O);

        int p1Score = 0;
        int p2Score = 0;

        int play = 1;
        while(play == 1) {
            TicTacToe game = new TicTacToe(player1, player2);

            System.out.println(game.getGameDisplay());

            int nextPlayer = secureRandom.nextInt(2);
            while (game.canPlay()) {
                if (nextPlayer == 0) {
                    try {
                        System.out.printf("%s, choose a play position from 1 - 9: ", player1.getName());
                        int pos = Integer.parseInt(input.next());

                        game.setPlayPosition(pos, player1);
                        nextPlayer = 1;
                    }
                    catch(NumberFormatException | PlayPositionException e){
                        System.out.println("Invalid play position, try again!");
                        System.out.println(e.getMessage());
                        continue;
                    }
                } else {
                    try {
                        System.out.printf("%s, choose a play position from 1 - 9: ", player2.getName());
                        int pos = Integer.parseInt(input.next());

                        game.setPlayPosition(pos, player2);
                        nextPlayer = 0;
                    }
                    catch(NumberFormatException | PlayPositionException e){
                        System.out.println("Invalid play position, try again!");
                        System.out.println(e.getMessage());
                        continue;
                    }
                }

                System.out.println(game.getGameDisplay());
            }

            System.out.println(game.printResult());

            if(game.getWinner() != null){
                if(game.getWinner() == player1){
                    p1Score++;
                } else if(game.getWinner() == player2){
                    p2Score++;
                }
            }

            System.out.println("\n\nWould you like to play again? 1 for yes, 0 for no: ");
            play = input.nextInt();
        }

        System.out.printf("""
                Player 1 - %s - %d
                Player 2 - %s - %d
                """, player1.getName(), p1Score, player2.getName(), p2Score);
    }
}
