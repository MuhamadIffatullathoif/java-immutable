package org.iffat.game_console.sealed;

public sealed abstract class SpecialAbstractClass permits FinalKid, NonSealedKid, SealedKid, SpecialAbstractClass.Kid {
    final class Kid extends SpecialAbstractClass {

    }
}
