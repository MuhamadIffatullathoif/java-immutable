package org.iffat.immutable_class;

public class PersonOfInterest extends PersonImmutable{
    protected PersonOfInterest(PersonImmutable person) {
        super(person);
    }
}
