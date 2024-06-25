package designPatterns.SolidPrinciples.DependencyInversionPrinciple.wrong;

public class CardPaymentService {

    public boolean doPayment(String idempotentId, double payment) {
        System.out.println("perform payment via card: "+idempotentId+": "+payment);
        return true;
    }
}
