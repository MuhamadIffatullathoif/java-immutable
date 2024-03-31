package org.iffat.game_console.game;

public record Shooter(String name) implements Player {

    boolean findPrize() {

        System.out.println("Prize found, score should adjusted");
        return false;
    }

    boolean useWeapon(String weapon) {

        System.out.println("You shot your " + weapon);
        return false;
    }
}
