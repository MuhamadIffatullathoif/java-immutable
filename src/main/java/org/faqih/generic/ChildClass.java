package org.faqih.generic;

import org.iffat.final_explored.generic.BaseClass;

public class ChildClass extends BaseClass {

    @Override
    protected void optionalMethod() {
        System.out.println("[Child:optionalMethod] Extra Stuff here");
        super.optionalMethod();
    }

//    @Override
//    public void recommendedMethod() {
//        System.out.println("[Child:recommendedMethod]: I'll do things my way");
//        optionalMethod();
//    }

    private void mandatoryMethod() {
        System.out.println("[Child:mandatoryMethod]:");
    }

    public static void recommendedStatic() {

        System.out.println("[Child:recommendedStatic]: Best Way to Do it");
        optionalStatic();
        // mandatoryStatic();
    }
}
