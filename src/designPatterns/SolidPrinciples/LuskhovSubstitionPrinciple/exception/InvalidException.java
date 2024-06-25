package designPatterns.SolidPrinciples.LuskhovSubstitionPrinciple.exception;

public class InvalidException extends RuntimeException{

    public InvalidException(String errorMsg) {
        super(errorMsg);
    }
}
