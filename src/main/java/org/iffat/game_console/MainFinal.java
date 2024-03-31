package org.iffat.game_console;

import org.iffat.game_console.game.Game;
import org.iffat.game_console.game.GameAction;
import org.iffat.game_console.game.GameConsole;
import org.iffat.game_console.game.Player;
import org.iffat.game_console.pirate.PirateGame;

// class SpecialGameAction extends GameAction {} can't extend from final class, enum, record

//class SpecialGameConsole<T extends Game<? extends Player>> extends GameConsole<Game<? extends Player>> {
//
//    public SpecialGameConsole(Game<? extends Player> game) {
//        super(game);
//    }
//}

public class MainFinal {
    public static void main(String[] args) {
        GameConsole<PirateGame> game = new GameConsole<>(new PirateGame("Pirate Game"));
    }
}
