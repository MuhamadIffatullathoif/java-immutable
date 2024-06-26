package org.iffat.game_console;

import org.iffat.game_console.game.GameConsole;
import org.iffat.game_console.pirate.Pirate;
import org.iffat.game_console.pirate.PirateGame;
import org.iffat.game_console.pirate.Town;
import org.iffat.game_console.pirate.Weapon;

public class Main {
    public static void main(String[] args) {
//        var console = new GameConsole<>(new ShooterGame("The Shootout Game"));
//
//        int playerIndex = console.addPlayer();
//        console.playGame(playerIndex);
        Weapon weapon = Weapon.getWeaponByChar('P');
        System.out.println("weapon = " + weapon + ", hitPoints="
                + weapon.getHitPoints() + ", minLevel=" + weapon.getMinLevel());

        var list = Weapon.getWeaponsByLevel(1);
        list.forEach(System.out::println);

        Pirate tim = new Pirate("Tim");
        System.out.println(tim);

        PirateGame.getTowns(0).forEach(town -> System.out.println(town.information()));
        System.out.println("-".repeat(90));
        PirateGame.getTowns(1).forEach(town -> System.out.println(town.information()));

        var console = new GameConsole<>(new PirateGame("The Pirate Game"));
        int playerIndex = console.addPlayer();
        console.playGame(playerIndex);

        Town bridgeTown = new Town("Bridgetown", "Barbados", 0);
        System.out.println(bridgeTown);
        System.out.println(bridgeTown.information());
    }
}
