package org.iffat.game_console;

import org.iffat.game_console.game.GameConsole;
import org.iffat.game_console.game.ShooterGame;

public class Main {
    public static void main(String[] args) {
        var console = new GameConsole<>(new ShooterGame("The Shootout Game"));

        int playerIndex = console.addPlayer();
        console.playGame(playerIndex);
    }
}
