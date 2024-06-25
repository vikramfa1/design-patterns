package designPatterns.SolidPrinciples.DependencyInversionPrinciple.right;

public class WalletPaymentService implements PaymentService{
    @Override
    public boolean doPayment(String idempotentId, double payment) {
        System.out.println("perform payment via Wallet: "+idempotentId+": "+payment);
        return true;
    }
}
