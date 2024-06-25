package designPatterns.SolidPrinciples.DependencyInversionPrinciple.right;

public interface PaymentService {

    public boolean doPayment(String idempotentId, double payment);
}
