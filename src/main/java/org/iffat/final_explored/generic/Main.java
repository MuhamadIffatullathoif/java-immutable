package org.iffat.final_explored.generic;

import org.iffat.final_explored.generic.ChildClass;
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

        System.out.println("-".repeat(90));
        BaseClass.recommendedStatic();
        ChildClass.recommendedStatic();

        String xArgument = "This is all i've got to say about Section ";
        StringBuilder zArgument = new StringBuilder("Only saying this: Section ");
        doXYZ(xArgument, 16, zArgument);
        System.out.println("After method: xArgument: " + xArgument);
        System.out.println("After method: zArgument: " + xArgument);

        StringBuilder tracker = new StringBuilder("Step 1 is abc");
        Logger.logToConsole(tracker.toString());
        tracker.append(", Step 2 is xyz.");
        Logger.logToConsole(tracker.toString());
        System.out.println("After logging, tracker = " + tracker);
    }

    private static void doXYZ(String x, int y, final StringBuilder z) {

        final String c = x + y;
        System.out.println("c = " + c);
        x = c;
        z.append(y);
        // z = new StringBuilder();
    }
}
