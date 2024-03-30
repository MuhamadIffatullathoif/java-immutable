package org.faqih.generic;

import org.iffat.final_explored.generic.BaseClass;

public class Main {
    public static void main(String[] args) {

        BaseClass parent = new BaseClass();
        ChildClass child = new ChildClass();
        BaseClass childReferredAsBase = new ChildClass();

        parent.recommendedMethod();
        System.out.println("-".repeat(90));
        childReferredAsBase.recommendedMethod();
        System.out.println("-".repeat(90));
        child.recommendedMethod();

        System.out.println("-".repeat(90));
        parent.recommendedStatic();
        System.out.println("-".repeat(90));
        childReferredAsBase.recommendedStatic();
        System.out.println("-".repeat(90));
        child.recommendedStatic();
    }
}
