package org.iffat.game_console.pirate;

public final class Soldier extends Combatant{

    public Soldier(String name, Weapon weapon) {
        super(name);
        setCurrentWeapon(weapon);
    }
}
