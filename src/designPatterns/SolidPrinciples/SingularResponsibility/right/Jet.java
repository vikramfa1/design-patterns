package designPatterns.SolidPrinciples.SingularResponsibility.right;

import designPatterns.SolidPrinciples.SingularResponsibility.wrong.Vehicle;

public class Jet implements Aircraft {
    //Jet implements the Aircraft


    @Override
    public void fly() {
        //only fly function is related
    }
}
