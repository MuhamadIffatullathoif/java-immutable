package org.iffat.immutable_class;

public class MainRecord {
    public static void main(String[] args) {
        PersonRecord jane = new PersonRecord("Jane", "01/01/1930");
        PersonRecord jim = new PersonRecord("Jim", "02/02/1932");
        PersonRecord joe = new PersonRecord("Joe", "03/03/1934");

        PersonRecord[] jhonKids = {jane, jim, joe};
        PersonRecord jhon = new PersonRecord("Jhon", "05/05/1900", jhonKids);
        System.out.println(jhon);

        PersonRecord jhonCopy = new PersonRecord("jhon", "05/05/1900");
        System.out.println(jhonCopy);

        PersonRecord[] kids = jhonCopy.kids();
        kids[0] = jim;
        kids[1] = new PersonRecord("Ann","04/04/1932");
        System.out.println(jhonCopy);
    }
}
