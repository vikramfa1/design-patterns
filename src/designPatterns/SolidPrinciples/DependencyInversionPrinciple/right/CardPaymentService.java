package designPatterns.SolidPrinciples.DependencyInversionPrinciple.right;

public class CardPaymentService implements PaymentService{


    @Override
    public boolean doPayment(String idempotentId, double payment) {
        System.out.println("perform payment via card: "+idempotentId+": "+payment);
        return true;
    }
}
