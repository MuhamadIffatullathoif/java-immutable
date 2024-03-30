package org.iffat.immutable_class;

public class MainImmutable {
    public static void main(String[] args) {
        PersonImmutable jane = new PersonImmutable("Jane", "01/01/1930");
        PersonImmutable jim = new PersonImmutable("Jim", "02/02/1932");
        PersonImmutable joe = new PersonImmutable("Joe", "03/03/1934");

        PersonImmutable[] jhonKids = {jane, jim, joe};
        PersonImmutable jhon = new PersonImmutable("Jhon", "05/05/1900", jhonKids);

        System.out.println(jhon);

        PersonImmutable[] kids = jhon.getKids();
        kids[0] = jim;
        kids[1] = new PersonImmutable("Ann","04/04/1932");
        System.out.println(jhon);

        jhonKids[0] = new PersonImmutable("Ann","04/04/1936");
        System.out.println(jhon);

        LivingPerson johnLiving = new LivingPerson(jhon.getName(), jhon.getKids());
        System.out.println(johnLiving);

        LivingPerson anne = new LivingPerson("Ann", null);
        johnLiving.addKid(anne);
        System.out.println(johnLiving);

        PersonOfInterest johnCopy = new PersonOfInterest(jhon);
        System.out.println(johnCopy);

        kids = johnCopy.getKids();
        kids[1] = anne;
        System.out.println(johnCopy);
        System.out.println(jhon);
    }
}
