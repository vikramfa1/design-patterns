package designPatterns.SolidPrinciples.SingularResponsibility.right;

public interface Aircraft {
    // Aircraft functionality is created out seperatly since it is not
    //having characterstics of vehicle
    public void fly();
}
