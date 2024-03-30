package org.iffat.immutable_class;

public class Main {
    public static void main(String[] args) {

//        Person jane = new Person();
//        jane.setName("jane");
//        Person jim = new Person();
//        jim.setName("jim");
//        Person joe = new Person();
//        joe.setName("joe");
//        Person jhon = new Person();
//        jhon.setName("jhon");
//        jhon.setDob("05/05/1900");
//        jhon.setKids(new Person[]{jane, jim, joe});
//        System.out.println(jhon);

        Person jane = new Person("Jane", "01/01/1930");
        Person jim = new Person("Jim", "02/02/1932");
        Person joe = new Person("Joe", "03/03/1934");

        Person[] jhonKids = {jane, jim, joe};
        Person jhon = new Person("Jhon", "05/05/1900", jhonKids);
        System.out.println(jhon);

        jhon.setKids(new Person[]{new Person("Ann", "04/04/1930")});
        System.out.println(jhon);

        Person[] kids = jhon.getKids();
        kids[0] = jim;
        System.out.println(jhon);

        kids = null;
        System.out.println(jhon);

        jhon.setKids(kids);
        System.out.println(jhon);
    }
}
