package designPatterns.SolidPrinciples.DependencyInversionPrinciple.wrong;

import designPatterns.SolidPrinciples.DependencyInversionPrinciple.right.PaymentService;

public class WalletPaymentService {

    public boolean doPayment(String idempotentId, double payment) {
        System.out.println("perform payment via Wallet: "+idempotentId+": "+payment);
        return true;
    }
}
